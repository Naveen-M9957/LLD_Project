

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public Double getCost() {
        return 100.0;
    }
    
}
