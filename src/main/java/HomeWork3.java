import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class StudyGroup{
    private String name;

    public StudyGroup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Stream implements Iterable<StudyGroup>{
    private List<StudyGroup> groups;
    public Stream(){
        groups = new ArrayList<>();
    }
    public void addGroup(StudyGroup group){
        groups.add(group);
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return groups.iterator();
    }
}
class StreamComporator{
    public int compareTo(Stream stream1, Stream stream2){
        int countGroup1 = stream1.hashCode();
        int countGroup2 = stream2.hashCode();
        return Integer.compare(countGroup1, countGroup2);
    }
}
class StreamService{
    public void sortStream(List<Stream> streams){
        streams.sort(new StreamComporator());
    }
}
class Controller{
    private StreamService streamService;

    public Controller(StreamService streamService) {
        this.streamService = streamService;
    }
    public void sortStream(List<Stream> streams){
        streamService.sortStream(streams);
    }
}
public class HomeWork3 {
    public static void main(String[] args) {
        StudyGroup sg1 = new StudyGroup("Группа 1");
        StudyGroup sg2 = new StudyGroup("Группа 2");
        StudyGroup sg3 = new StudyGroup("Группа 3");

        Stream stream1 = new Stream();
        stream1.addGroup(sg1);
        stream1.addGroup(sg2);

        Stream stream2 = new Stream();
        stream2.addGroup(sg3);

        StreamService streamService = new StreamService();
        Controller controller = new Controller(streamService);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        controller.sortStream(streams);

        for (Stream stream : streams){
            System.out.println("Поток: ");
            for (StudyGroup studyGroup : stream){
                System.out.println("- " + studyGroup.getName());
            }
        }

    }
}
