package Patterns;

public class AdultPresent extends PresentBuilder{
    @Override
    void buildName() {
        present.setName("Adult present");
    }

    @Override
    void buildFood() {
        present.setFood(Food.NUTS);
    }

    @Override
    void buildPrice() {
        present.setPrice(100);
    }
}
