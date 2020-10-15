public class Square extends Shape2D {
    double sideLength;

    String getName() {
        return "square";
    }
    Square(double length) {
        sideLength = length;
    }
    double getArea() {
        return sideLength*sideLength;
    }
}