package gb.OOP.HW_3;

import java.util.Comparator;

public class StudentComporator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
