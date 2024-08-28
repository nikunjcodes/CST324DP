public class ColdDrink implements Item{
    @Override
    public Packing packing(){
        return new Bottle();
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