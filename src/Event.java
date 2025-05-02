public class Event{
    protected Person person;
    protected Date date;
    protected Time timeStart,timeEnd;
    protected String subject,desc;
    public Event(String subject,String desc,Person person,Date date,Time timeStart, Time timeEnd){
        this.person=person;
        this.subject=subject;
        this.desc=desc;
        this.date=date;
        this.timeStart=timeStart;
        this.timeEnd=timeEnd;
    }
    //setters:
    public void setSubject(String subject){
        this.subject=subject;
    }
    public void setDesc(String desc){
        this.desc=desc;
    }
    public void setPerson(Person person){
        this.person=person;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public void setTimeStart(Time timeStart){
        this.timeStart=timeStart;
    }
    public void setEndTime(Time timeEnd){
        this.timeEnd=timeEnd;
    }
    //todos los getters:
    public String getSubject(){return this.subject;}
    public String getDesc(){return this.desc;}
    public Person getPerson(){return this.person;}
    public Date getDate(){return this.date;}
    public Time getStartTime(){return this.timeStart;}
    public Time getEndTime(){return this.timeEnd;}
    public String toString(){
        return "Asunto: " + this.subject + " | Fecha: " + this.date.toString() + " | Hora inicio: " + this.timeStart.toString() +
        " | Hora de finalización: " + this.timeEnd.toString() + " | Descripción: " + this.desc;
    }
}
