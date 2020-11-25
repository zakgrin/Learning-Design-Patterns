public class ThickCrustPizza extends Pizza {
    
    public ThickCrustPizza() {
        description = "Thick Crust " + description;
        print();
    }

    public double cost() {
        return 1;
    }
}
