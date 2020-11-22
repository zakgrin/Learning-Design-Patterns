// MiniDuckSimulator
public class Main {
    public static void main(String[] args) {
        
        // We Can't: 
        // Duck myDuck = new Duck(); // we can't create an object from abstract class!

        // We Can: use subclass as type
        MallardDuck myMallardDuck = new MallardDuck();
        myMallardDuck.display();
        myMallardDuck.swim();
        myMallardDuck.performFly();
        myMallardDuck.performQuack();
        // We Can: use superclass as Type
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.swim();
        mallard.performFly();
        mallard.performQuack();

        
    }
}
