public class Demo {
    public static void main(String[] args) {
        GameContext gc = new GameContext();
        gc.setState(new HealthyState());
        gc.gameAction();
        System.out.println();
        gc.setState(new SurvivalState());
        gc.gameAction();
        System.out.println();
        gc.setState(new DeadState());
        gc.gameAction();
    }
    
}
