package Patterns;

public class PresentMain {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new AdultPresent());
        Present present = director.buildPresent();

        System.out.println(present);
    }
}
