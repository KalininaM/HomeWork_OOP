package gb.OOP.HW_3;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        StudentStream stream = new StudentStream(1);

        StudentGroup group1 = new StudentGroup("Group 1", 20);
        StudentGroup group2 = new StudentGroup("Group 2", 10);
        StudentGroup group3 = new StudentGroup("Group 3", 15);

        stream.addGroup(group1);
        stream.addGroup(group2);
        stream.addGroup(group3);

        for (StudentGroup group : stream) {
            System.out.println(group);
        }
        System.out.println("Отсортированный список: ");
        Collections.sort(stream.getGroups());
        for (StudentGroup group : stream) {
            System.out.println(group);
        }
    }
}