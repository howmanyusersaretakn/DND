import java.util.*;
public class Game {
    static ArrayList<Player> players = new ArrayList<Player>();


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Encounter DIE = new Encounter();
        System.out.println("How many players would you like?");
        int PlayerNum = scan.nextInt();
        System.out.println("Welcome to a DND journey. Pick your character class \n 1. Barbarian \n 2. Bard \n 3. Cleric \n 4. Druid \n 5. Fighter \n 6. Monk \n 7. Paladin \n 8. Ranger \n 9. Rogue \n 10. Sorceror \n 11. Warlock \n 12. Wizard");
        for(int i = 0; i < PlayerNum; i++){
            System.out.print("Player " + (i+1) + ":");
            int charClass = scan.nextInt();
            switch(charClass){
                case(1):
                    System.out.println("You have chosen Barbarian");  
                    players.add(new Barbar());
                    break;
                case(2):
                    System.out.println("You have chosen Bard");  
                    players.add(new Bard());
                    break;
                case(3):
                    System.out.println("You have chosen Cleric");  
                    players.add(new Cleric());
                    break;
                case(4):
                    System.out.println("You have chosen Druid");  
                    players.add(new Druid());
                    break;
                case(5):
                    System.out.println("You have chosen Fighter");  
                    players.add(new Fighter());
                    break;
                case(6):
                    System.out.println("You have chosen Monk");  
                    players.add(new Monk());
                    break;
                case(7):
                    System.out.println("You have chosen Paladin");  
                    players.add(new Paladin());
                    break;
                case(8):
                    System.out.println("You have chosen Ranger");  
                    players.add(new Ranger());
                    break;
                case(9):
//                    System.out.println("You have chosen Rogue");  
                    players.add(new Rogue());
                    break;
                case(10):
                    System.out.println("You have chosen Sorceror");  
                    players.add(new Sorceror());
                    break;
                case(11):
                    System.out.println("You have chosen Warlock");  
                    players.add(new Warlock());
                    break;
                case(12):
                    System.out.println("You have chosen Wizard");  
                    players.add(new Wizard());
                    break;
                default:
                    System.out.println("You are a disappointment!!!");
                    System.exit(0);
            }
        }
        
        String output = "";
        for (int i = 0; i < players.size(); i++) {
            output += players.get(i) + "\n";
        }

        for(int i = 0; i < players.size(); i++){
            System.out.println(players.get(i).inv.inventoryList);
        }
        // ^ this prints player inventory
        DIE.encountStart(players);
        scan.close();
    }
}
//