public class CheeseDecorator extends Decorator {
    double cost = 60.0;
    Pizza pizza;
    public CheeseDecorator(Pizza pizza){
    this.pizza  = pizza;
    }
    public double cost(){
        return pizza.cost() + cost;

    }
    public String getDescription(){
        return pizza.getDescription() + " Decorated by Cheese";
    }
    
}
