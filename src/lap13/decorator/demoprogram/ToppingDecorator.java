package lap13.decorator.demoprogram;

public abstract class ToppingDecorator extends Pizza{
    protected Pizza pizza;

    public abstract String getDescription();
}
