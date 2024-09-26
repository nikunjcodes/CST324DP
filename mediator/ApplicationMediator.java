import java.util.*;
public class ApplicationMediator extends Mediator {
    private List<Colleague> colleagues;
    
    public ApplicationMediator() {
        colleagues = new ArrayList<Colleague>();
    }
    
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }
    
    public void send(String message, Colleague originator) {
        for(Colleague colleague: colleagues) {
            if(colleague != originator) {
                colleague.receive(message);
            }
        }
    }

}
