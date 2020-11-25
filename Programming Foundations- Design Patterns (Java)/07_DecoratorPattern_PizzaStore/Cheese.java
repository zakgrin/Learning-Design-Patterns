public class Cheese extends Toppings {
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
        description = pizza.getDescription() + ", Cheese";
        print();
    }

    public double cost() {
        return pizza.cost() + 1;
    }
}
