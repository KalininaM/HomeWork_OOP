package HomeWork3;

import java.time.LocalDate;

public class Student extends User{
    public Student(String firstName, String secondName) {
        super(firstName, secondName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                '}';
    }
}
