package task2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Irina", "Sokolova", 122);
        System.out.println("Original student:");
        System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Group number: " + student.getGroupNumber());

        student.moveToNextGroup();
        System.out.println("\nStudent after moving to new group:");
        System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("New group number: " + student.getGroupNumber());

               Student clonedStudent = new Student(student);


        System.out.println("\nAre recordings equal? " + (student == clonedStudent));


        student.setFirstName("Julia");
        System.out.println("\nName of original student: " + student.getFirstName());
        System.out.println("Name of cloned student: " + clonedStudent.getFirstName());
    }
}
