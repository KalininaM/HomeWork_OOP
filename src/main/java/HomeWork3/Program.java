package HomeWork3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Program {
    /**
     * — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
     * — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
     * — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
     * — Модифицировать класс Контроллер, добавив в него созданный сервис;
     * — Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.
     * @param args
     */
    public static void main(String[] args) {
        DataService dataService = new DataService();
        StudentGroupService studentGroupService = new StudentGroupService();
        UserView userView = new UserView();
        UserController userController = new UserController(dataService, studentGroupService, userView);

        Student student1 = userController.createStudent("ivanov","ivan");
        Student student2 = userController.createStudent("petrov","petr");
        List<Student> students = new ArrayList<>(List.of(new Student[]{student1, student2}));
        userController.createStudentGroup(new Teacher("Sergeev", "Sergey"),
                students);
    }
}
