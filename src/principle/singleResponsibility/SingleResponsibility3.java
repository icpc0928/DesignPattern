package principle.singleResponsibility;

public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("汽車");
        vehicle2.runAir("飛機");
        vehicle2.runWater("輪船");
    }


}

/**
 * 方案3的分析:
 * 1. 這種修改方法沒有對原來的類做大的修改，只是增加了方法
 * 2. 這裡雖然沒有在類別的級別上遵守單一職責原則，但是在方法的級別上，仍然是遵守單一職責
 */
//同一個包下面不能有同名的類
class Vehicle2{
    public void runRoad(String vehicle){
        System.out.println(vehicle + " 在公路上運行...");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle + " 在天空上運行...");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle + " 在水中上運行...");
    }
}

/**
 * 單一職責原則注意事項和細節
 * 降低類的複雜度，一個類只負責一項職責
 * 提高類的可讀性，可維護姓
 * 降低變更引起的風險
 * 通常情況下，我們應當遵守單一職責原則，只有邏輯足夠簡單，才可以在代碼級違反單一職責原則; 只有類中方法數量足夠少，可以在方法級別保持單一職責原則
 */
