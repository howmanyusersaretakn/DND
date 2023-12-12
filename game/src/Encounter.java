import java.util.*;

public class Encounter {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    public void encountStart(ArrayList<Player> players){
        Enemy enemy = null;
        int enemyType = Rolls.roll(3);
        int enemyInitiative = Rolls.roll(21);

        switch(enemyType){
            case(0):
            int TinyRand = (int) (Math.random() * Enemy.tiny.length);
            if(Enemy.tiny[TinyRand].equals("Badger")){
                enemy = new Badger();
            } else if(Enemy.tiny[TinyRand].equals("Crawling Claw")){
                enemy = new ClawCrawl();
            } else if(Enemy.tiny[TinyRand].equals("Demilich")){
                enemy = new Demilich();
            } else if(Enemy.tiny[TinyRand].equals("Faerie Dragon")){
                enemy = new DragonFae();
            } else if(Enemy.tiny[TinyRand].equals("Flameskull")){
                enemy = new FlameSkull();
            } else if(Enemy.tiny[TinyRand].equals("Homunculus")){
                enemy = new Homunculus();
            } else if(Enemy.tiny[TinyRand].equals("Pseudodragon")){
               enemy = new PseudoDragon();
            } else if(Enemy.tiny[TinyRand].equals("Intellect Devourer")){
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
            if(Enemy.med[MedRand].equals("Acolyte")){
                enemy = new Acolyte();
            } else if(Enemy.med[MedRand].equals("Animated Armor")){
                enemy = new ArmorAnim();
            } else if(Enemy.med[MedRand].equals("Archmage")){
                enemy = new ArchMage();
            } else if(Enemy.med[MedRand].equals("Doppleganger")){
                enemy = new DoppleGang();
            } else if(Enemy.med[MedRand].equals("Bandit")){
                enemy = new Bandit();
            } else if(Enemy.med[MedRand].equals("Bandit Captain")){
                enemy = new CaptBandit();
            } else if(Enemy.med[MedRand].equals("Berserker")){
                enemy = new Berserker();
            } else if(Enemy.med[MedRand].equals("Blue Dragon Wyrmling")){
                enemy = new BlueDragonWyrm();
            } else if(Enemy.med[MedRand].equals("Death Knight")){
                enemy = new DeathKnight();
            } else if(Enemy.med[MedRand].equals("Drow Mage")){
                enemy = new DrowMage();
            } 


            case(3):
            int LargeRand = (int)(Math.random()*Enemy.large.length);
            if(Enemy.large[LargeRand].equals("Chimera")){
                new Chimera();    
            } else if(Enemy.large[LargeRand].equals("Dao")){
                new Dao();
            } else if(Enemy.large[LargeRand].equals("Dire Wolf")){
                new DireWolf();
            } else if(Enemy.large[LargeRand].equals("Giant Owl")){
                new GiantOwl();
            } else if(Enemy.large[LargeRand].equals("Gorgon")){
                new Gorgon();
            } else if(Enemy.large[LargeRand].equals("Grick Alpha")){
                new GrickAlpha();
            } else if(Enemy.large[LargeRand].equals("Griffon")){
                new Griffon();
            } else if(Enemy.large[LargeRand].equals("Minotaur")){
                new Minotaur();
            } else if(Enemy.large[LargeRand].equals("Owlbear")){
                new OwlBear();
            } else if(Enemy.large[LargeRand].equals("Wyvern")){
                new Wyvern();
            }


            case(4):
            int HugeRand = (int)(Math.random()*Enemy.huge.length);
            if(Enemy.huge[HugeRand].equals("")){

            }


            case(5):
            int GargantRand = (int)(Math.random()*Enemy.gargant.length);


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
                System.out.println(enemy + " attacks Player " + (i+1));
                // attacks the player
                // prompts the player
                System.out.println("Player " + (i+1) + "'s turn:");
                System.out.println("What will you do? \n 1. Attack \n 2. Run away");
                int Choice = scan.nextInt();
                switch(Choice){
                    case(1):

                    case(2):
                        System.out.println("You ran away. Coward.");
                        Choice = 0;
                    default:
                        System.out.println("Unable to continue");
                        break;
                }
                
            } else {
                // player goes first
                System.out.println("Player " + (i+1) + "'s turn:");
                //prompts the player
                System.out.println("What will you do? \n 1. Attack \n 2. Run away");
                int Choice = scan.nextInt();
                switch(Choice){
                    case(1):

                    case(2):
                        System.out.println("You ran away. Coward.");
                        Choice = 0;
                    default:
                        System.out.println("Unable to continue");
                        break;
                }
                // enemy attacks
            }
        }

    }
}
