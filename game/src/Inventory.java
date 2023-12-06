import java.util.*;
public class Inventory {
    ArrayList<String> InventoryList = new ArrayList<>();
    public void inventoryAdd(String item){
        InventoryList.add(item);
    }
    public void inventoryRem(String item){
        InventoryList.remove(item);
    }
    public void inventoryBasic(){
        InventoryList.add("Backpack");
        InventoryList.add("Potion");
        InventoryList.add("Dagger");
        InventoryList.add("Torch");
        InventoryList.add("Rope");
        InventoryList.add("Rations");
        InventoryList.add("Bedroll");
    }
}
