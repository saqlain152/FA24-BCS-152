public class Main {




    public static void main(String[] args) {
        Principal principal = new Principal("saqlain ali sattar", 50, 25);
        School school = new School("Hamza", "123 Main St", principal);

        Teacher teacher1 = new Teacher("Ali", 40, 101, "Mathematics");
        Teacher teacher2 = new Teacher("Tallat", 35, 102, "Science");

        Classroom class1 = new Classroom("Grade 10", "G10", teacher1);
        Classroom class2 = new Classroom("Grade 11", "G11", teacher2);
        
        school.addClassroom(class1);
        school.addClassroom(class2);

        class1.enrollStudent(new Student("Hamza", 15, 1));
        class1.enrollStudent(new Student("Abdullah", 16, 2));
        class1.enrollStudent(new Student("Zain", 15, 3));
        class1.enrollStudent(new Student("Tayab", 16, 4));
        class1.enrollStudent(new Student("Waleed", 15, 5));
        class1.enrollStudent(new Student("Muneeb", 16, 6)); 

        System.out.println(school);

        
        Student s1 = new Student("Hamza", 15, 1);
        Student s2 = new Student("Abdullah", 15, 1);
        System.out.println("Students equal: " + s1.equals(s2));

        Teacher t1 = new Teacher("Ali", 40, 101, "Mathematics");
        Teacher t2 = new Teacher("Tallat", 35, 102, "Science");
        System.out.println("Teachers equal: " + t1.equals(t2));
    










    }
    
}
