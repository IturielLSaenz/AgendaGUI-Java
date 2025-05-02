public class Person {
    protected String name;
    protected String tel;
    protected String email;
    public Person(){
        this.name="N/A";
        this.tel="N/A";
        this.email="N/A";
    }
    public Person(String name, String tel, String email){
        this.name=name;
        this.tel=tel;
        this.email=email;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setTel(String tel){
        this.tel=tel;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getName(){return this.name;}
    public String getTel(){return this.tel;}
    public String getEmail(){return this.email;}
    public String _toString(){
        return ("Nombre: " + this.name + " | Tel: " + this.tel + " | Email: " + this.email);
    }
}
