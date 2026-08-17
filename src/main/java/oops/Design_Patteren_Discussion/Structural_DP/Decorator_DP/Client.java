public class Client {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();

        pizza = new CheeseDecorator(pizza);
        pizza = new MushroomDecorator(pizza);
        pizza = new OliveDecorator(pizza);

        System.out.println("Pizza : " + pizza.getDescription());
        System.out.println("Cost  : " + pizza.getCost());
    }
}

/**
 * Execution Flow
 * Plain Pizza      ---> Cost = 100
 * Cheese Pizza     ---> Cost = 100 + 20 = 120
 * Mushroom Pizza   ---> Cost = 120 + 30 = 150
 * Olive Pizza      ---> Cost = 150 + 15 = 165
 * Cost = 165
 */