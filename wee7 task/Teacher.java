public class Teacher extends Person {

    int teacherid;
    String subject;
  




    public Teacher(String name,int age,int teacherid,String subject){

        super(name,age);
        this.teacherid=teacherid;
        this.subject=subject;


    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Teacher)) return false;
        Teacher other = (Teacher) obj;
        return this.teacherid == other.teacherid;
    }

    public String toString(){
        return super.toString() + "Teacher id: "+teacherid+"Subject: "+subject;
    
    
    
    }
        
    


    
}
