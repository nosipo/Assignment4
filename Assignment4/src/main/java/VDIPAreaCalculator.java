
public class VDIPAreaCalculator {
    public static double getArea(VDIPRectangle rectangle){
        return rectangle.getWidth() * rectangle.getHeight();
    }

    public static double getArea(VDIPCircle circle){
        return circle.getRadius() * circle.getRadius() * Math.PI;
    }
}
