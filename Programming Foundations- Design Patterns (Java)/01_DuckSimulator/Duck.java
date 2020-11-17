public abstract class Duck {
    
    // Properties: 
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // Abstract: must be defined for subclasses
    abstract void display();

    // Constructor: 
    public Duck() {
    }
    
    // Methods: 
    public void setFlyBehavior() {
        
    }
    public void setQuackBehavior() {

    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("I'm swimming!");
    }
    // public void display() {
    //     System.out.println("I'm a Parent Duck!");
    // }
}