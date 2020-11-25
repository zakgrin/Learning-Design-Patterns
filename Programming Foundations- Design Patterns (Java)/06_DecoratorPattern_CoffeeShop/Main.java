public class Main {
    public static void main(String[] args) {
        Beverage myEspresso = new Espresso();
        myEspresso = new Milk(myEspresso);
        myEspresso = new Milk(myEspresso);
        myEspresso.print();

        Beverage myDarkRaost = new DarkRaost();
        myDarkRaost = new Soy(myDarkRaost);

        Beverage myDecaf = new Decaf();
        myDecaf = new Mocha(myDecaf);

        Beverage myHouseBlend = new HouseBlend();
        myHouseBlend = new Whip(myHouseBlend);
        myHouseBlend = new Whip(myHouseBlend);
        myHouseBlend = new Whip(myHouseBlend);
        myHouseBlend.print();
    }    
}
