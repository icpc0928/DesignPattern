package factory.methodfactory.pizzastore.order;

public class PizzaStore {

    public static void main(String[] args) {

        String local = "BJ";
        if(local.equals("BJ")){
            //創建北京口味的各種pizza
            new BJOrderPizza();
        }else if(local.equals("LD")){
            //創建倫敦口味的各種pizza
            new LDOrderPizza();
        }

    }
}
