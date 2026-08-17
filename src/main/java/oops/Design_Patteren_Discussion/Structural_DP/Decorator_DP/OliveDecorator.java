public class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+ " + Olive";
    }

    @Override
    public Double getCost() {
        return pizza.getCost() + 15.0;
    }
    
}
