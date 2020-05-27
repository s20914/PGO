package Task1;

import java.util.*;

public class Car implements Comparable<Car> {

    String CarModel;
    int ProductionYear;

    public int compareTo(Car c){
        return this.ProductionYear - c.ProductionYear;
    }

    public Car(String CarModel, int ProductionYear){
        this.CarModel=CarModel;
        this.ProductionYear=ProductionYear;
    }

   /* public int getProductionYear() {
        return ProductionYear;
    }

    public String getCarModel() {
        return CarModel;
    }*/


}
