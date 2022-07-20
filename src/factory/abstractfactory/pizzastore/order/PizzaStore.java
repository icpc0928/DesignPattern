package factory.abstractfactory.pizzastore.order;

public class PizzaStore {

    public static void main(String[] args) {
        //抽象工廠  使用北京的工廠
//        new OrderPizza(new BJFactory());
        //使用倫敦工廠
        new OrderPizza(new LDFactory());



    }
}
