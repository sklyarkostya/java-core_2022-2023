package lab2;

public class Rectangle5 implements Shape{
    private double length, width;
    public Rectangle5(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return (length * width);
    }

    public double getPerimeter(){
        return ((length * width) * 2);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
