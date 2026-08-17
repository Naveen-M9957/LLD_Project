public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+ " + Mushroom";
    }

    @Override
    public Double getCost() {
        return pizza.getCost() + 30.0;
    }
    
}
