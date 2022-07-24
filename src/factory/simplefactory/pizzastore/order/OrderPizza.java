package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    //構造器
//    public OrderPizza(){
//        Pizza pizza = null;
//        String orderType; //訂購披薩類型
//
//        do{
//            orderType = getType();
//            if(orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName(orderType);
//            }else if(orderType.equals("cheese")){
//                pizza = new CheesePizza();
//                pizza.setName(orderType);
//            }else if(orderType.equals("pepper")){
//                pizza = new PepperPizza();
//                pizza.setName(orderType);
//            }
//
//            else{
//                break;
//            }
//
//            //輸出pizza 製作過程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }

    //寫一個方法可以動態獲取客戶希望訂購的披薩種類

    //定義一個簡單工廠對象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    //構造器具
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }


    public void setFactory(SimpleFactory simpleFactory){
        String orderType = ""; //用戶輸入的

        this.simpleFactory = simpleFactory; //設置簡單工廠對象

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            //輸出pizza信息
            if(pizza != null){  //訂購成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else{
                System.out.println("沒有此Pizza 訂購失敗");
                break;
            }
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
