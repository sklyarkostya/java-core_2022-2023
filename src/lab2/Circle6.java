package lab2;

public class Circle6 {
    private int radius;

    public Circle6(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimetr(){
        return Math.PI * radius * 2;
    }
}
