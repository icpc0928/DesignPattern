package factory.simplefactory.pizzastore.order;

//相當於客戶端 發起訂購任務
public class PizzaStore {
    public static void main(String[] args) {

//        new OrderPizza();

        //使用簡單工廠模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println("退出程序");

        //使用簡單工廠的靜態模式
        new OrderPizzaStatic();
    }
}
