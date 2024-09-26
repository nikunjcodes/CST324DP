public abstract class Mediator {

    public abstract void send(String message, Colleague colleague);
    public abstract void addColleague(Colleague colleague);
}