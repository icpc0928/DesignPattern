package factory.simplefactory.pizzastore.pizza;

public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 給製作胡椒披薩 準備原材料 ");
    }
}
