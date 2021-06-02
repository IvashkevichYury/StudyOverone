package Patterns;

public class Director {
    PresentBuilder builder;

    public void setBuilder(PresentBuilder builder) {
        this.builder = builder;
    }

    Present buildPresent() {
        builder.createPresent();
        builder.buildName();
        builder.buildFood();
        builder.buildPrice();

        Present present = builder.getPresent();

        return present;
    }
}
