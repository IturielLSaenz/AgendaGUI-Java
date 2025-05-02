import java.util.ArrayList;

public class Agenda {
    protected Person owner;
    ArrayList<Event> events = new ArrayList<Event>();
    public Agenda(Person owner){
        this.owner=owner;
    }
    public void addEvent(Event event){
        if (!events.contains(event)) {
            events.add(event);
        }
    }
    public void removeEvent(Date date,Time sTime,Time eTime){
        for (Event event : events) { //por cada evento : (en) eventos
            if (event.getDate().equals(date) && event.getStartTime().equals(sTime) && event.getEndTime().equals(eTime)) {
                events.remove(event);
                break;
            }
        }
    }
    // public String show(){
    //     if (events.isEmpty()){
    //         return "No hay eventos para mostrar!";
    //     }

    // }
    public ArrayList<Event> getEventList(){
        return this.events;
    }
    public Event getEventAtIndex(int index){
        return this.events.get(index);
    }
    // public String toString(){
        
    // }
}
