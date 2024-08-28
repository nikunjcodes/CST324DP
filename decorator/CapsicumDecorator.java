public class CapsicumDecorator extends Decorator {
    double cost = 40.0;
    Pizza pizza;
    public CapsicumDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    public double cost(){
        return pizza.cost() + cost;
    }
    public String getDescription(){
        return pizza.getDescription() + "  Decorated by Capiscum";
    }
}
