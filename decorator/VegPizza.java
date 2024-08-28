public class VegPizza extends Pizza {
    double value;
    public VegPizza(){
        description = "Veg Pizza";
        value = 200.0;
    }

    public double cost(){
        return value;
    }
    
}
