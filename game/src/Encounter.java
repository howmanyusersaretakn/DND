import java.util.*;
public class Encounter {
    Random rand = new Random();
    public void encountStart(){
        Enemy enemy = null;
        Rolls r = new Rolls();
        int PlayerInitiative = r.die(21);
        int EnemyIntitiative = r.die(21);
        int enemyType = r.die(1);
        System.out.println("You rolled " + PlayerInitiative);
        System.out.println("The enemy rolled " + EnemyIntitiative);
        switch(enemyType){
            case(0):
            int TinyRand = (int) (Math.random() * Enemy.tiny.length);
            if(Enemy.tiny[TinyRand].equals("Badger(cr0)")){
                enemy = new Badger();
            } else if(Enemy.tiny[TinyRand].equals("Crawling Claw(0)")){
                enemy = new ClawCrawl();
            } else if(Enemy.tiny[TinyRand].equals("Demilich(18)")){
                enemy = new Demilich();
            } else if(Enemy.tiny[TinyRand].equals("Faerie Dragon(1)")){
                enemy = new DragonFae();
            } else if(Enemy.tiny[TinyRand].equals("Flameskull(4)")){
                enemy = new FlameSkull();
            } else if(Enemy.tiny[TinyRand].equals("Homunculus(0)")){
                enemy = new Homunculus();
            } else if(Enemy.tiny[TinyRand].equals("Pseudodragon(1/4)")){
               enemy = new PseudoDragon();
            } else if(Enemy.tiny[TinyRand].equals("Intellect Devourer(2)")){
                enemy = new DevourIntel();
            }
            break;
            case(1):
            int SmallRand = (int) (Math.random() * Enemy.small.length);
            case(2):

            case(3):

            case(4):

            case(5):

            case(6):

            default:
        }
        System.out.println(enemy.toString() + " has appeared!");
        if(PlayerInitiative < EnemyIntitiative){
            
        }
    }
}
