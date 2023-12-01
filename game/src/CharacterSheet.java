import java.util.*;
public class CharacterSheet {
    public int hitPoints;
    

    public int lostHit(int num){
        int total = hitPoints - num;
        return total;
    }
}
