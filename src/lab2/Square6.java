package lab2;

public class Square6 {
    private int side;

    public Square6(int side){
        this.side = side;
    }

    public int getArea(){
        return side * side;
    }

    public int getPerimetr(){
        return side * 4;
    }
}
