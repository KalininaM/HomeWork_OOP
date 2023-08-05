package gb.OOP.HW_3;

public class StudentGroup implements Comparable<StudentGroup> {
    private String name;
    private int numberOfStudents;

    public StudentGroup(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int compareTo(StudentGroup otherGroup) {
        return Integer.compare(this.numberOfStudents, otherGroup.numberOfStudents);
    }

    public String toString() {
        return "Group " + name + " (" + numberOfStudents + " students)";
    }
}
