package factory.abstractfactory.pizzastore.order;

import factory.abstractfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    AbsFactory factory;

    //構造器
    public OrderPizza(AbsFactory factory){
        setAbsFactory(factory);
    }

    //改成私有的
    private void setAbsFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType = "";//用戶輸入

        this.factory = factory;

        //構造器


        do{
            orderType = getType();
            //factory可能是 BJFactory子類 / 也可能是LDFactory子類
            pizza = factory.createPizza(orderType);
            if(pizza != null){
                //訂購成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("訂購失敗");
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
