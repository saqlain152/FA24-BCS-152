public class Student extends Person{
   private int rollnumber;

    public Student(String name,int age,int rollnumber){

        super(name,age);
        this.rollnumber=rollnumber;

    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return this.rollnumber == other.rollnumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", Roll Number: " + rollnumber;
    }
}






    

