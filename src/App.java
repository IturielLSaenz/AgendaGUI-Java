public class App {
    public static void main(String[] args) throws Exception {
        /*
        Aquí irá el código para la GUI
        
        */ 
        //creando un objeto:
        Person persona = new Person("Ituriel","8713488381","iliebes@anahuac.mx");
        Date fecha = new Date(2025,4,10);
        Time timeStart = new Time(10,0,0);
        Time timeEnd = new Time(11,30,0);
        Event evento1 = new Event("Clase programación","Clase para aprender a programar",persona,fecha,timeStart,timeEnd);
        System.out.println(evento1.toString());
    }
}
