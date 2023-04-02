package lab2;

public class Cat8 extends Animal8{
    private String breed;

    public Cat8(String name, Integer age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
}
