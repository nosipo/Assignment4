
public class OCPCircle extends OCPShape {

    private double radius;

    public OCPCircle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return getRadius() * getRadius() * Math.PI;
    }
}
