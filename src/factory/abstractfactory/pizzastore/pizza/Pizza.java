package factory.abstractfactory.pizzastore.pizza;

//將Pizza類做成抽象類
public abstract class Pizza {
    protected String name; //名字

    //準備原材料，不同的Pizza是不一樣的 因此我們做成抽象方法
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking;");
    }

    public void cut(){
        System.out.println(name + " cutting;");
    }

    public void box(){
        System.out.println(name + " boxing;");
    }

    public void setName(String name){
        this.name = name;
    }
}
