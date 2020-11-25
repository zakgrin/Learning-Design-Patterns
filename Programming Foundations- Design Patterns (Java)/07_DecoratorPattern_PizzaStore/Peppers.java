public class Peppers extends Toppings {
    public Peppers(Pizza pizza) {
        this.pizza = pizza;
        description = pizza.getDescription() + ", Peppers";
        print();
    }

    public double cost() {
        return pizza.cost() + 1;
    }
}
