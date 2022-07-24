package factory.factoryMethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza{

    @Override
    public void prepare() {
        setName("倫敦奶酪pizza");
        System.out.println("倫敦奶酪pizza準備原材料");
    }
}
