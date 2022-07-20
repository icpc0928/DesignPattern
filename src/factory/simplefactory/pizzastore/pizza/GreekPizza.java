package factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println(" 給製作希臘披薩 準備原材料 ");
    }
}
