public class Football extends Game {
    @Override
    void initialize() {
        super.initialize();
        System.out.println("Football Game initialized");
    }
    @Override
    void startPlay() {
        System.out.println("Start of play of Football");
    }    
    @Override
    void endPlay() {
        System.out.println("End of play of Football");
    }
    
    
}
