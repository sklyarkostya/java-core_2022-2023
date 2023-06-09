package Codewars;

public class Pillars8 {
    public static int pillars(int numPill, int dist, int width){
        if(numPill <= 1) {
            return 0;
        } else return (numPill - 1) * dist * 100 + (numPill - 2) * width;
    }
}
