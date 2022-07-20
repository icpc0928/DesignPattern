package factory.methodfactory.pizzastore.order;


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
