package gun3odev2;

public class Main {
    public static void main(String[] args) {
        UserManager instructorManager = new InstructorManager();
        UserManager studentManager = new StudentManager();
        Instructor instructor1 = new Instructor(1,"Berkay","haberal");
        Student student1 = new Student(1,"ali","veli");

        instructor1.setExpYear(4);
        student1.getName();

        System.out.println(instructor1.getName() + " " + instructor1.getSurname());

        instructorManager.add();
        instructorManager.remove();
        studentManager.add();
    }
}
