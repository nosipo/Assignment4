
public class DIPCircle {

    private double radius;

    public DIPCircle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return getRadius() * getRadius() * Math.PI;
    }
}
