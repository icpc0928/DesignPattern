package factory.methodfactory.pizzastore.order;


import factory.methodfactory.pizzastore.pizza.BJCheesePizza;
import factory.methodfactory.pizzastore.pizza.BJPepperPizza;
import factory.methodfactory.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
