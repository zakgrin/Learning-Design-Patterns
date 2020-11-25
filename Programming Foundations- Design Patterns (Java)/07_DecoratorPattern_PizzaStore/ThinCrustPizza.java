public class ThinCrustPizza extends Pizza {
    
    public ThinCrustPizza() {
        description = "Thin Crust " + description;
        print();
    }

    public double cost() {
        return 1;
    }
}
