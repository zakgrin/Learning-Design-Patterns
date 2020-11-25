import sun.security.krb5.internal.crypto.dk.DkCrypto;

public class Olives extends Toppings {
    public Olives(Pizza pizza) {
        this.pizza = pizza;
        description = pizza.getDescription() + ", Olives";
        print();
    }

    public double cost() {
        return pizza.cost() + 1;
    }
}
