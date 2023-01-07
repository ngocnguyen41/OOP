package lap13.decorator.demoprogram;

public abstract class Pizza {
    protected String description = "Basic Pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
