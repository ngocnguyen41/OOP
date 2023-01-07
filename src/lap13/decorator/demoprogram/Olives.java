package lap13.decorator.demoprogram;

public class Olives extends ToppingDecorator {
    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    @Override
    public double cost() {
        return pizza.cost() + .30;
    }
}
