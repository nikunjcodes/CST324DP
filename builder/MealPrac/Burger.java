public class Burger implements Item{
    @Override
    public Packing packing(){
        return new Wrapper();
    }
    @Override
    public  float price(){
        return 0.0f;
    }
    @Override
    public String name(){
        return null;
    }
}                   