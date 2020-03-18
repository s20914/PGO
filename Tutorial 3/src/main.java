public class main {
    public static void main (String[] args){
        AirPLane plane = new AirPLane(200, "Boeing");

        int numberOfSeats = plane.getNumberOfSeats();
        System.out.println("This plane has " + numberOfSeats + " seats");

        String brand = plane.getBrand();
        System.out.println("This plane is called " + brand);


        Engine boeing = new Engine(2001, 21000);

        boolean isEco = boeing.isEco();
        if(boeing.isEco() == true){
            System.out.println("This engine is eco");
        }else {
            System.out.println("this engine is not eco");
        }
    }

}