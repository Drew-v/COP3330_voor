import static java.lang.Math.pow;
public class Cube extends Shape3D{
    double sideLength;
    Cube(double length) {
        sideLength = length;
    }
    String getName() {
        return "cube";
    }
    double getArea() {
        return pow(sideLength, 2)*6;
    }
    double getVolume() {
        return pow(sideLength,3);
    }
}
