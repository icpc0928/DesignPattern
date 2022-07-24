package factory.factoryMethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("倫敦胡椒pizza");
        System.out.println("倫敦胡椒pizza準備原材料");
    }
}
