package factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 給製作奶酪披薩 準備原材料 ");
    }

}
