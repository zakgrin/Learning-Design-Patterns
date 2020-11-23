public class Main {
    public static void main(String[] args) {

        /**
         * Observer Pattern is used to make subject and observer: 
         * - loosely coupled.
         * - interact with little knowledge of each other.
        */
        
        Subject myPublisher = new Publisher();
        Observer subscriber1 = new Subscriber(myPublisher); // registered!
        Observer subscriber2 = new Subscriber(myPublisher); // registered!
        Observer subscriber3 = new Subscriber(myPublisher); // registered!

        myPublisher.registerObserver(subscriber1); // already registered!
        myPublisher.removeObserver(subscriber2); // removed!
        myPublisher.notifyObservers(); // Value: 0 Value: 0
        myPublisher.setValue(20); // Value: 20 Value: 20
        myPublisher.registerObserver(subscriber2); // registered!
        myPublisher.setValue(100); // Value: 100 Value: 100 Value: 100
    }
}
