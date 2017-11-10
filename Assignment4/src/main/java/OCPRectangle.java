
public class OCPRectangle extends OCPShape {
    private double width;
    private double height;

    public OCPRectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return getWidth() * getHeight();
    }
}
