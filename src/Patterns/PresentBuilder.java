package Patterns;

public abstract class PresentBuilder {
    Present present;

    void createPresent() {
        present = new Present();
    }

    abstract void buildName();
    abstract void buildFood();
    abstract void buildPrice();

    Present getPresent() {
        return present;
    }
}
