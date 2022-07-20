package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.CheesePizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.PepperPizza;
import factory.simplefactory.pizzastore.pizza.Pizza;

//簡單工廠類
public class SimpleFactory {

    //根據 orderType 返回對應的Pizza對象
    public Pizza createPizza(String orderType){

        Pizza pizza = null;

        System.out.println("使用簡單工廠模式");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName(orderType);
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName(orderType);
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName(orderType);
        }

        return pizza;
    }

    //簡單工廠模式也叫做 靜態工廠模式
    //根據 orderType 返回對應的Pizza對象
    public static Pizza createPizza_static(String orderType){

        Pizza pizza = null;

        System.out.println("使用簡單工廠模式_靜態工廠模式");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName(orderType);
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName(orderType);
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName(orderType);
        }

        return pizza;
    }



}
