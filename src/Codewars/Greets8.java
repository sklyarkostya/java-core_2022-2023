package Codewars;

public class Greets8 {
    public static String greet(String name) {

        if(name.equals("Johnny")){
            return "Hello, my love!";
        }

        return String.format("Hello, %s!", name);
    }
}
