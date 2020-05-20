
public class Rectangle implements Figure{

    double sideA;
    double sideB;
    String type = "Rectangle";

    public Rectangle(double sideA, double sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }

    @Override
    public double getPerimeter() {
        double rectanglePerimeter = sideA*2+sideB*2;
        return rectanglePerimeter;
    }

    @Override
    public double getArea() {
        double rectangleArea = sideA*sideB;
        return rectangleArea;
    }

    @Override
    public String getType() {
        return type;
    }
}
