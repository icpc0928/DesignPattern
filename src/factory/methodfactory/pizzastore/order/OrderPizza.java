package factory.methodfactory.pizzastore.order;

import factory.methodfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {


    //定義一個抽象方法 createPizza 讓各個工廠子類 自己實現
    abstract Pizza createPizza(String orderType);

    //構造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType; //訂購披薩類型

        do{
            orderType = getType();
            pizza = createPizza(orderType); //這個是抽象方法。由工廠子類別完成實作

            //輸出pizza 製作過程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }



    //寫一個方法可以獲取客戶希望訂購的披薩種類
    private String getType(){
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
        }
        return "";
    }
}
