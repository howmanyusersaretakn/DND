import java.util.*;

public class Encounter {
    Random rand = new Random();
    public void encountStart(ArrayList<Player> players){
        Enemy enemy = null;
        int enemyType = Rolls.roll(1);
                
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

        ArrayList<Integer> playerInitiatives = new ArrayList<Integer>();
        ArrayList<Integer> initiativeIndex = new ArrayList<Integer>();

        playerInitiatives.add(Rolls.roll(21));
        initiativeIndex.add(0);

        // Loop through
        // Find where element is greater than previous element but less than next element

        for(int i = 1; i < players.size(); i++){
            int roll = Rolls.roll(21);
            int maxIndex = -1;

            for (int j = 0; j < playerInitiatives.size(); j++) {
                if(roll > playerInitiatives.get(j)){
                    maxIndex = j;
                    break;
                }
            }  

            if (maxIndex >= 0) {
                playerInitiatives.add(maxIndex, roll);
                initiativeIndex.add(maxIndex, i);
            } else {
                playerInitiatives.add(roll);
                initiativeIndex.add(i);
            }
        }

        for (int i = 0; i < playerInitiatives.size()) {
            Player player = players.get(initiativeIndex.get(i));
        }
        //^what is this
        
        // ArrayList<Player> newPlayers = (ArrayList<Player>) players.clone();


        // System.out.println(enemy.toString() + " has appeared!");
        // System.out.println("You rolled " + PlayerInitiative);
        // System.out.println("The enemy rolled " + EnemyIntitiative);
        // if(PlayerInitiative < EnemyIntitiative){
    }
}
