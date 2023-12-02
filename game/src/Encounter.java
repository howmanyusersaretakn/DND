import java.util.*;
public class Encounter {
    public void encountStart(){
        Rolls r = new Rolls();
        int initiative = r.die(21);
        System.out.println(initiative);
        int enemyType = r.die(2);
        switch(enemyType){
            case(0):
            
        }
    }
}
