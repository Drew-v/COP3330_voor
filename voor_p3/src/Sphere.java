import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sphere extends Shape3D {
    double radius;

    Sphere(double radiusLength) {
        radius = radiusLength;
    }
    String getName() {
        return "sphere";
    }
    double getArea() {
        return 4*radius*radius*PI;
    }
    double getVolume() {
        return 4*(PI*pow(radius, 3))/3;
    }
}
