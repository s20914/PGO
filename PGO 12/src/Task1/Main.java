package Task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Opel", 2010));
        cars.add(new Car("Ford", 2001));
        cars.add(new Car("Skoda", 2012));
        cars.add(new Car("VW", 2003));
        cars.add(new Car("Volvo", 2006));
        cars.add(new Car("Peugeot", 2005));
        cars.add(new Car("Audi", 2006));
        cars.add(new Car("BMW", 2007));
        cars.add(new Car("Mercedes", 2008));
        cars.add(new Car("Fiat", 2009));

        Collections.sort(cars);


        for(Car s: cars){
            System.out.println(s.ProductionYear + ", " + s.CarModel);
        };
    }
}
