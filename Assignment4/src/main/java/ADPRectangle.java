/**
 *ADP - violation

 Rectangle class will only compile when Circle class has compiled. Circle class will only compile when Rectangle class has has compiled.
 */
public class ADPRectangle {
    private double width;
    private double height;

    public ADPRectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

   /* public void punchAhole(ADPCircle circle){
        width = circle.getRadius() * Math.PI;
    }*/
}
