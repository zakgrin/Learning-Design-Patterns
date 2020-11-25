public abstract class Pizza {
    public String description = "Pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void print() {
        System.out.println(description + " (" + cost() + " Euro)");
    }
}
