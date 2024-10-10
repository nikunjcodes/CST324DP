public class Cricket extends Game {
    @Override
    void initialize() {
        super.initialize();
        System.out.println("Cricket game initialized");
    }
    @Override
    void startPlay() {
        System.out.println("Start of play of cricket");
    }    
    @Override
    void endPlay() {
        System.out.println("End of play of cricket");
    }

    
}
