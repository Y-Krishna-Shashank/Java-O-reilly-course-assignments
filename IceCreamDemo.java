public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIceCream = new IceCream("Chocolate", 3, 2);
        IceCream myIceCream2 = new IceCream("Choco fudge", 4, 2);

        myIceCream.addTopping("nuts");
        myIceCream2.addTopping("Raisins");
    printIceCream(myIceCream);
    printIceCream(myIceCream2);

    }
    public static void printIceCream(IceCream iceCream)
    {
        System.out.println(iceCream.getName());
        System.out.println("Cost: $"+iceCream.getCost());
        iceCream.printToppings();
    }
}
