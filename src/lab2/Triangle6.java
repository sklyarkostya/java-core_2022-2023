package lab2;

public class Triangle6 {
    private double one_side, two_side, three_side, height;

    public Triangle6(int side, int height){
        this.height = height;
        this.one_side = one_side;
        this.two_side = two_side;
        this.three_side = three_side;
    }

    public double getArea(){
        return one_side * height / 2;
    }

    public double getPerimeter(){
        return one_side + two_side + three_side;
    }
}
