import java.util.*;
public class Inventory {
    ArrayList<String> inventoryList = new ArrayList<>();
    public void inventoryAdd(String item){
        inventoryList.add(item);
    }
    public void inventoryBasic(){
        inventoryList.add("Backpack");
        inventoryList.add("Potion");
        inventoryList.add("Dagger");
        inventoryList.add("Torch");
        inventoryList.add("Rope");
        inventoryList.add("Rations");
        inventoryList.add("Bedroll");
    }
}
