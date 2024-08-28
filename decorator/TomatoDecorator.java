public class TomatoDecorator extends Decorator {
    double cost = 50.0;
    Pizza pizza;
    public TomatoDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    public double cost(){
        return pizza.cost() + cost;
    }
    public String getDescription(){
        return pizza.getDescription() + "  Decorated by Tomato";
    }
}
