class Date {
    //Atributos
    private int year, month, day;
    //Constructores de la clase que no recibe datos
    public Date() {
        this.year = 2000;
        this.month = 1;
        this.day = 1;
    }
    //Constructor que recibe datos 
    public Date(int year, int month, int day) {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }
    //*Métodos GET
    public int getYear() {return this.year;}
    public int getMonth() {return this.month;}
    public int getDay() {return this.day;}
    
    //Métodos SET
    public void setYear(int year) {
        this.year = year>0 ? year : 2000;
    }
    public void setMonth(int month) {
        this.month = (month>0 && month<13) ? month : 1;
    }
    public void setDay(int day) {
        int limiteSuperior = 0;
        if(this.month==1||this.month==3||this.month==5||this.month==7||this.month==8||this.month==10||this.month==12)
            limiteSuperior = 31;
        else {
            //o los meses de 30 días
            if(this.month==4||this.month==6||this.month==9||this.month==11)
                limiteSuperior = 30;
            //o si es febrero, checamos si es año bisiesto o no
            else 
                if(this.leapYear()) 
                    limiteSuperior = 29;
                else
                    limiteSuperior = 28;
        }
        if(day>0 && day<=limiteSuperior)
            this.day = day;
        else 
            this.day = 1;
    }
    //Método para convertir a texto
    public String toString(){
        String d, m, y;
        if(this.day<10)
            d = "0" + (this.day);
        else
            d= ""+(this.day);
        if(this.month<10)
            m = "0" + (this.month);
        else
            m = "" + (this.month);
        if(this.year<10)
            y = "000" + (this.year);
        else
            if(this.year<100)
                y = "00" + (this.year);
            else
                if(this.year<1000)
                    y = "0" + (this.year);
                else
                    y = "" + (this.year);
            
        return d + "/" + m + "/" + y;
    }
    
    //INCREMENTOS 
    public void incYear() {
        this.year++;
    }
    public void incMonth(){
        this.month++;
        if(this.month > 12) {
            this.month = 1;    
            this.incYear();
        }
    }
    public void incDay() {
        this.day++;
        int maxNumDays = 0;
        if(this.month==1||this.month==3||this.month==5||this.month==7||this.month==8||this.month==10||this.month==12)
            maxNumDays = 31;
        else {
            //o los meses de 30 días
            if(this.month==4||this.month==6||this.month==9||this.month==11)
                maxNumDays = 30;
            //o si es febrero, checamos si es año bisiesto o no
            else 
                if(this.leapYear()) 
                    maxNumDays = 29;
                else
                    maxNumDays = 28;
        }
        if(this.day > maxNumDays) {
                this.day = 1;
                this.incMonth();
        }
    }
        
    //DECREMENTOS 
    public void decYear() {
        this.year--;
        if(this.year<0) {
            System.out.println("ERROR: Se alcanzó el año cero. No se puede decrementar más.");
            this.year=0;
        }
}
    public void decMonth(){
        if ((this.month--)<1){
            this.month=12;
            this.decYear();
        }
    }
    
    public void decDay() {
        int maxNumDaysPreviousMonth=0;
        this.day--;
        int m = this.month-1;
        if(m<1) {
            m = 12;
        }
        if(m==1 || m==3 || m==5 || m==07 || m==8 ||m==10 || m==12) {
            maxNumDaysPreviousMonth = 31;
        }
        //o los meses de 30 días
        else
            if(m==4 || m==6 || m==9 || m==11){
                maxNumDaysPreviousMonth = 30;
            }
            //o si es febrero, checamos si es año bisiesto o no
            else
                if(this.leapYear())
                    maxNumDaysPreviousMonth = 29;
                else
                    maxNumDaysPreviousMonth = 28;
        if(this.day < 1) {
            this.day = maxNumDaysPreviousMonth;
            this.decMonth();
        }
    }
    
    //AÑO BISIESTO 
    public boolean leapYear() {
        return this.year%4==0 && (this.year%100!=0 || this.year%400==0);
    }
}