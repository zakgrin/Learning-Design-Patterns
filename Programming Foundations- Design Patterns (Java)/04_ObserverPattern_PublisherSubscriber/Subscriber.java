public class Subscriber implements Observer {
    private int value; 
    private Subject publisher;

    public Subscriber(Subject publisher) {
        this.publisher = publisher;
        publisher.registerObserver(this);
    }

    public void update(int value) {
        this.value = value;
        display();
    }
    
    public void display() {
        System.out.println("Value: " + value);
    }
}
