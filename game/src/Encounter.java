import java.util.*;

public class Encounter {
    Random rand = new Random();
    public void encountStart(ArrayList<Player> players){
        Enemy enemy = null;
        int enemyType = Rolls.roll(1);
        int enemyInitiative = Rolls.roll(21);

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
            } else {
                System.exit(0);
            }
            break;
            case(1):
            int SmallRand = (int) (Math.random() * Enemy.small.length);
            if(Enemy.small[SmallRand].equals("Dark Mantle")){
                enemy = new DarkMantle();
            } else if(Enemy.small[SmallRand].equals("Giant Centipede")){
                enemy = new CentiGiant();
            } else if(Enemy.small[SmallRand].equals("Winged Kobold")){
                enemy = new KoboldWing();
            } else if(Enemy.small[SmallRand].equals("Awakened Shrub")){
                enemy = new ShrubAwake();
            } else if(Enemy.small[SmallRand].equals("Flying Sword")){
                enemy = new SwordFly();
            } 
            case(2):
            int MedRand = (int) (Math.random()*Enemy.med.length);
            if(Enemy.med[MedRand].equals("")){
                enemy = new Acolyte();
            } else if(Enemy.med[MedRand].equals("")){
                enemy = new ArmorAnim();
            } else if(Enemy.med[MedRand].equals("")){
                enemy = new ArchMage();
            } else if(Enemy.med[MedRand].equals("")){
                enemy = new DoppleGang();
            } else if(Enemy.med[MedRand].equals("")){
                enemy = new Bandit();
            } else if(Enemy.med[MedRand].equals("")){
                enemy = new CaptBandit();
            } else if(Enemy.med[MedRand].equals("")){
                enemy = new Berserker();
            } else if(Enemy.med[MedRand].equals("")){
                enemy = new BlueDragonWyrm();
            } else if(Enemy.med[MedRand].equals("")){
                enemy = new DeathKnight();
            } else if(Enemy.med[MedRand].equals("")){
                enemy = new DrowMage();
            } 
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

        for (int i = 0; i < playerInitiatives.size(); i++) {
            Player player = players.get(initiativeIndex.get(i));
            int playerInitiative = playerInitiatives.get(i);
            if (enemyInitiative > playerInitiative) {
                // enemy goes first
                System.out.println(enemy + " attacks!");
                // attacks the player
                // prompts the player
            } else {
                // player goes first
                System.out.println("Player " + initiativeIndex.get(i) + " goes first");
                //prompts the player
                // enemy attacks
            }
        }

    }
}
