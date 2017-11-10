
public class ADPAreaCalculator {

    public static double getArea(ADPRectangle rectangle){
        return rectangle.getWidth() * rectangle.getHeight();
    }

    public static double getArea(ADPCircle circle){
        return circle.getRadius() * circle.getRadius() * Math.PI;
    }
}
