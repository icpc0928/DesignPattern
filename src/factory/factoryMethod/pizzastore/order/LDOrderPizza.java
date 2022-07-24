package factory.factoryMethod.pizzastore.order;


import factory.factoryMethod.pizzastore.pizza.LDCheesePizza;
import factory.factoryMethod.pizzastore.pizza.LDPepperPizza;
import factory.factoryMethod.pizzastore.pizza.Pizza;
import factory.methodfactory.pizzastore.pizza.*;

public class LDOrderPizza extends OrderPizza{

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
