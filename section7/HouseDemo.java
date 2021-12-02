public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(3,10,"blue");

        myHouse.setNumStories(2);
        myHouse.setNumWindows(6);
        myHouse.setColor("red");

        printHouseData(myHouse);
        printHouseData(yourHouse);



    }
    public static void printHouseData(House house) {

        System.out.println("House is " + house.getColor() + " and has " + house.getNumStories() + " stories and " +
                house.getNumWindows() + " windows.");
    }
}
