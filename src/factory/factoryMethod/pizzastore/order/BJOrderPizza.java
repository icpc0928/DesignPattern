package factory.factoryMethod.pizzastore.order;


import factory.factoryMethod.pizzastore.pizza.BJCheesePizza;
import factory.factoryMethod.pizzastore.pizza.BJPepperPizza;
import factory.factoryMethod.pizzastore.pizza.Pizza;

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
