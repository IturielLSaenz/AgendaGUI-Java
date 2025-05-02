public class Time {
    protected int hour=00,minute=00,second=00;
    public Time(int hour,int minute,int sencond){
        setHour(hour);
        setMinute(minute);
        setSecond(sencond);
    }
    public void setHour(int hour){
        try{
            if(hour>=0 && hour<=24){
                this.hour=hour;
            }else{
                this.hour=00;
                throw new IllegalArgumentException("No es un valor válido para la hora!");
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void setMinute(int minute){
        try{
            if(minute>=0 && minute<=59){
                this.minute=minute;
            }else{
                this.minute=00;
                throw new IllegalArgumentException("No es un valor válido para los minutos!");
            }
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
    public void setSecond(int second){
        try{
            if(second>=0 && second<=59){
                this.second=second;
            }else{
                throw new IllegalArgumentException("No es un valor válido para los segundos!");
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public int getHour(){return this.hour;}
    public int getMinute(){return this.minute;}
    public int getSecond(){return this.second;}
    public void incrementSecond(double increment){ //aumentamos por segundos
        if(this.second+increment>=60){
            this.second=00;
            this.second+=(increment-1);
            this.minute+=1;
            if(this.minute==60){
                this.minute=00;
                this.hour+=1;
            }
        }
    }
    public String toString(){
        return String.format("%02d:%02d:%02d", (int)this.hour, (int)this.minute, (int)this.second);
    }

}
