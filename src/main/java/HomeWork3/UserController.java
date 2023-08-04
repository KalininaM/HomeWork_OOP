package HomeWork3;

import java.util.List;

public class UserController {
    private final DataService dataService;
    private  final StudentGroupService studentGroupService;
    private final UserView userView;

    public UserController(DataService dataService, StudentGroupService studentGroupService, UserView userView) {
        this.dataService = dataService;
        this.studentGroupService = studentGroupService;
        this.userView = userView;
    }

    public Student createStudent(String firstName, String secondName) {
        Student student = dataService.create(firstName, secondName);
        List<User> userList = dataService.getAll();
        userView.printOnConsole(userList);
        return student;
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        StudentGroup studentGroup = studentGroupService.createStudentGroup(teacher, students);
        userView.printOnConsole(studentGroup);
    }
}
