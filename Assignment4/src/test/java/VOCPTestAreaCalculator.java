
public class VOCPTestAreaCalculator {

    public static void main(String[] args){
        VOCPRectangle rectangle = new VOCPRectangle(100,200);
        double rectangleArea = VOCPAreaCalculator.getArea(rectangle);
        VOCPCircle circle = new VOCPCircle(10);
        double circleArea = VOCPAreaCalculator.getArea(circle);
    }
}
