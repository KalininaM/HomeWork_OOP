package gb.OOP.HW_3;

public class StudentController {
    private LearnGroupService learnGroupService;

    public StudentController() {
        learnGroupService = new LearnGroupService();
    }

    public LearnGroupService getLearnGroupService() {
        return learnGroupService;
    }

    public void setLearnGroupService(LearnGroupService learnGroupService) {
        this.learnGroupService = learnGroupService;
    }

    public void remove(String name) {
        learnGroupService.remove(name);
    }

    public void sort() {
        learnGroupService.sortStudent();
    }

    public void sortComparator() {
        learnGroupService.sortName();
    }
}