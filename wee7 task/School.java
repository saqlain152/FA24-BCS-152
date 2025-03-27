public class School {
    private String name;
    private String address;
    private Principal principal;
    private Classroom classrooms[];
    private int classcount;



    public School(String name,String address,Principal principal){
        this.name=name;
        this.address=address;
        this.principal=principal;
        this.classrooms=new Classroom[10];
        this.classcount=0;

}


public void addClassroom(Classroom classroom) {
    if (classcount < 10) {
        classrooms[classcount++] = classroom;
    }
}

@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("School: ").append(name).append("\nAddress: ").append(address).append("\n");
    sb.append("Principal: ").append(principal).append("\n\n");
    sb.append("Classrooms:\n");
    for (int i = 0; i < classcount; i++) {
        sb.append(classrooms[i]).append("\n");
    }
    return sb.toString();
}
}




    

