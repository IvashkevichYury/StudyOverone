package Patterns;

public class ChildrenPresent extends PresentBuilder{
    @Override
    void buildName() {
        present.setName("Children present");
    }

    @Override
    void buildFood() {
        present.setFood(Food.CANDY);
    }

    @Override
    void buildPrice() {
        present.setPrice(80);
    }
}
