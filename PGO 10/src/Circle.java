import java.lang.Math.*;
public class Circle implements Figure {

    double radius;
    String type = "Circle";

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getPerimeter() {
        double circlePerimeter = radius * 2 * Math.PI;
        return circlePerimeter;
    }

    @Override
    public double getArea() {
        double circleArea = radius * radius * Math.PI;
        return circleArea;
    }

    @Override
    public String getType() {
        return type;
    }
}
