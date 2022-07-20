package factory.abstractfactory.pizzastore.order;

import factory.abstractfactory.pizzastore.pizza.*;

//這是一個工廠子類
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {

        System.out.println("～使用抽象工廠模式～");
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
