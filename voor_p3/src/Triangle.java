public class Triangle extends Shape2D {
    double Length; double height;

    String getName() {
        return "triangle";
    }
    Triangle(double length, double triangleHeight) {
        Length = length;
        height = triangleHeight;
    }
    double getArea() {
        return Length*height*0.5;
    }
}
