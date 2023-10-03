package task2;

public class Student {
    private String firstName;
    private String lastName;
    private int groupNumber;

        public Student(String firstName, String lastName, int groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

        public String getFirstName() {
        return firstName;
}
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber <= 0) {
            throw new RuntimeException("Номер группы должен быть положительным");
        }
        else this.groupNumber = groupNumber;
    }

        public void moveToNextGroup() {
        this.groupNumber++;
    }

       public Student(Student originalStudent) {
        this.firstName = originalStudent.getFirstName();
        this.lastName = originalStudent.getLastName();
        this.groupNumber = originalStudent.getGroupNumber();
    }
}
