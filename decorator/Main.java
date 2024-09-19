public class Main {
    public static void main(String[] args) {
        Pizza pizza = new TomatoDecorator(new VegPizza());
        System.out.println(pizza.getDescription() + " Cost:  Rs " + pizza.cost());
}
}
