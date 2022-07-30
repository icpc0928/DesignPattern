package principle.singleResponsibility;

public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托車");
        roadVehicle.run("汽車");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飛機");

    }
}

/**
 * 方案2的分析:
 * 1. 遵守單一職責原則
 * 2. 但是這樣做它的花銷(改動)很大，即將類分解，同時修改客戶端(Vehicle改成 RoadVehicle)
 * 3. 改進: 直接修改原先的Vehicle類，改動的代碼會比較少 => 方案3
 */

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " 在公路上運行...");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " 在天空上運行...");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " 在水中上運行...");
    }
}