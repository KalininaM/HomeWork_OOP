package gb.OOP.HW_3;

public class Controller extends StudentController{
    private StreamService streamService;

    public Controller(StreamService streamService) {
        super();
        this.streamService = streamService;
    }

    public Controller() {
        streamService = new StreamService();
    }

    public void setStreamService(StreamService service) {
        this.streamService = service;
    }
    public void sortStream () {
        streamService.sortStreams(streamService.getStreamList());
    }
}