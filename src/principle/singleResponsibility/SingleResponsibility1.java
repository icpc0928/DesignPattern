package principle.singleResponsibility;

public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托車");
        vehicle.run("汽車");
        vehicle.run("飛機");
    }

}


//交通工具類
//方案16

//1. 在方式1的run方法中，違反單一職責原則
//2. 解決方案非常簡單，根據交通工具運行的方式不同，分解成不同的類即可 => 方案2
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " 在公路上運行...");
    }
}
