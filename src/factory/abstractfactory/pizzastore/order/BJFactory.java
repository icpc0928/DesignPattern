package factory.abstractfactory.pizzastore.order;

import factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import factory.abstractfactory.pizzastore.pizza.BJPepperPizza;
import factory.abstractfactory.pizzastore.pizza.Pizza;

//這是一個工廠子類
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {

        System.out.println("～使用抽象工廠模式～");
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
