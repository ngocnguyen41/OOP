package lap13.decorator.exercises.icecream;

public abstract class ToppingDecorator implements IceCream {

    protected IceCream iceCream;

    public String getDescription() {
        return iceCream.getDescription();
    }

    public abstract String addTopping();
}
