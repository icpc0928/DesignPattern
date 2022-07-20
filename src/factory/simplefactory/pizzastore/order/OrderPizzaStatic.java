package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizzaStatic {

    Pizza pizza = null;

    //靜態創建簡單工廠方式
    //構造器具
    public OrderPizzaStatic( ){
        String orderType = "";
        do {
            orderType = getType();
            //使用簡單工廠的靜態方法
            pizza = SimpleFactory.createPizza_static(orderType);
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
