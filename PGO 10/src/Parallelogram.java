
public class Parallelogram implements Figure{

    double baseSide;
    double side;
    double height;
    String type = "Parallelogram";

    public Parallelogram(double baseSide, double side, double height){
        this.baseSide=baseSide;
        this.side=side;
        this.height=height;
    }

    @Override
    public double getPerimeter() {
        double parallelogramPerimeter = baseSide * 2 + side * 2;
        return parallelogramPerimeter;
    }

    @Override
    public double getArea() {
        double parallelogramArea = baseSide * height;
        return parallelogramArea;
    }

    @Override
    public String getType() {
        return type;
    }
}
