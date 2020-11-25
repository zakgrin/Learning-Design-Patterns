public class Main {
    public static void main(String[] args) {
        Pizza myThinPizza = new ThinCrustPizza();
        myThinPizza = new Cheese(myThinPizza);
        myThinPizza = new Olives(myThinPizza);
        myThinPizza = new Olives(myThinPizza);
        myThinPizza = new Peppers(myThinPizza);
        System.out.println(myThinPizza.getDescription());
        System.out.println(myThinPizza.cost());

        Pizza myThickPizza = new ThickCrustPizza();
        myThickPizza = new Cheese(myThickPizza);
        myThickPizza = new Olives(myThickPizza);
        myThickPizza = new Olives(myThickPizza);
        myThickPizza = new Peppers(myThickPizza);
        System.out.println(myThickPizza.getDescription());
        System.out.println(myThickPizza.cost());
    }    
}
