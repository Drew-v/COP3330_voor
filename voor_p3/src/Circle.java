import static java.lang.Math.PI;
public class Circle extends Shape2D {
    double radius;

    String getName() {
        return "circle";
    }
    Circle(double length) {
        radius = length;
    }
    double getArea() {
        return radius*radius*PI;
    }
}