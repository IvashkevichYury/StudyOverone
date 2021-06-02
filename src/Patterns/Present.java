package Patterns;

public class Present {
    private String name;
    private Food food;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Present{" +
                "name='" + name + '\'' +
                ", food=" + food +
                ", price=" + price +
                '}';
    }
}
