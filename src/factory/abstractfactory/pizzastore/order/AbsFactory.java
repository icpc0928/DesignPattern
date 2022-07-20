package factory.abstractfactory.pizzastore.order;

import factory.abstractfactory.pizzastore.pizza.Pizza;

//是一個抽象工廠模式的抽象層（接口）
public interface AbsFactory {

    //讓下面的工廠子類來具體實現
    public Pizza createPizza(String orderType);
}
