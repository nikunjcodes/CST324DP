public abstract class Game{
    void initialize(){
        System.out.println("Welcome Screen");
        System.out.println("Company Logo Design");
    }
    abstract void startPlay();
    abstract void endPlay();
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}