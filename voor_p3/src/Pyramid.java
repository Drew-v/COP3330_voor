import static java.lang.Math.pow;
public class Pyramid extends Shape3D{
    double baseLength;
    double baseWidth;
    double pyramidHeight;


    Pyramid(double length, double width, double height) {
        baseLength = length;
        baseWidth = width;
        pyramidHeight = height;

    }
    String getName() {
        return "pyramid";
    }
    double getArea() {

        return (baseLength*baseWidth) + baseLength*pow((pow((baseWidth/2), 2)+pow(pyramidHeight, 2)),0.5)
                + baseWidth*pow((pow((baseLength/2), 2)+pow(pyramidHeight, 2)),0.5);
    }
    double getVolume() {
        return (baseLength*baseWidth)*pyramidHeight/3;
    }
}
