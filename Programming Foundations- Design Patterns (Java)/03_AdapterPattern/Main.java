// Duck Simulator with Adapter Pattern
public class Main {
    
    public static void main(String[] args) {
        // Test a Duck: 
        Duck myDuck = new MallardDuck();
        testDuck(myDuck);
        // Test a Turkey: 
        Turkey myTurkey = new WildTurkey();
        // testDuck(turkey); // testDuck expects a duck!
        Duck myAdapteeTurkey = new TurkeyAdapter(myTurkey);
        testDuck(myAdapteeTurkey); // turkey can not be treated as a duck!
        Drone myDrone = new SuperDrone();
        Duck myAdapteeDrone = new DroneAdapter(myDrone);
        testDuck(myAdapteeDrone);
    }

    static void testDuck(Duck duck) {
        duck.quack(); duck.fly();
    }
}
