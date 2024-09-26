public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator  = new ApplicationMediator();
        Colleague desktop = new DesktopColleague(mediator);
        Colleague mobile = new MobileColleague(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        System.out.println("Desktop initiates the message");
        desktop.send("Hello from Desktop");
        mobile.send("Hello from Mobile");
        System.out.println("Mobile initiates the message");
        mobile.send("Mobile says hello now");
        desktop.send("Desktop says hello now");
    }
}
