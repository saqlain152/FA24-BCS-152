public class Classroom {

    private String classname;
    private String classcode;
    private Teacher teacher;
    private Student students[];
    private int studentcount;




    public Classroom(String classname,String classcode,Teacher teacher){
        this.classname=classname;
        this.classcode=classcode;
        this.students=new Student[5];
        this.studentcount=0; 
    }

    public boolean enrollStudent(Student student) {
        if (studentcount < 5) {
            students[studentcount++] = student;
            return true;
        } else {
            System.out.println("Class " + classname + " is full! Cannot enroll " + student.name);
            return false;
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class Name: ").append(classname).append(" (" + classcode + ")\n");
        sb.append("Teacher: ").append(teacher).append("\n");
        sb.append("Students:\n");
        for (int i = 0; i < studentcount; i++) {
            sb.append("  ").append(students[i]).append("\n");
        }
        return sb.toString();
    }
}
    
