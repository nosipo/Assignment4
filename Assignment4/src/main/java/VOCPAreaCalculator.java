
public class VOCPAreaCalculator {

    public static double getArea(VOCPRectangle rectangle){
        return rectangle.getWidth() * rectangle.getHeight();
    }

    public static double getArea(VOCPCircle circle){
        return circle.getRadius() * circle.getRadius() * Math.PI;
    }
}
