
public class OCPTestAreaCalculator {

    public static void main(String[] args){
        OCPShape rectangle = new OCPRectangle(100,200);
        double rectangleArea = OCPAreaCalculator.getArea(rectangle);
        OCPShape circle = new OCPCircle(10);
        double circleArea = OCPAreaCalculator.getArea(circle);
    }
}
