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
    public void setFlyBehavior(FlyBehavior selectedFlyBehavior) {
        // this.flyBehavior = new selectedFlyBehavior();
        
    }
    public void setQuackBehavior(QuackBehavior selectedQuackBehavior) {
        // this.quackBehavior = new selectedQuackBehavior();
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