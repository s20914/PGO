import java.util.ArrayList;

public class Main {
    public static void main (String args[]){
        House house=House.createHouse("Street");

        Room room1 = new Room(26);
        Room room2 = new Room(84);
        Room room3 = new Room(120);
        Room room4 = new Room(205);

        house.addRoom(room1);
        house.addRoom(room2);
        house.addRoom(room3);
        house.addRoom(room4);

        Furniture f1 = new Furniture("chair", 100);
        Furniture f2 = new Furniture("table", 150);
        Furniture f3 = new Furniture("sofa", 400);
        Furniture f4 = new Furniture("bed", 237);

        f1.getPrice(true);

        room1.add(f1);
        room1.add(f2);
        room1.add(f3);
        room1.add(f4);
        System.out.println("Your home has " + house.getRoomCount() + " rooms");
        System.out.println("Your furniture will cost " + room1.getOverallPrice());
    }
}
