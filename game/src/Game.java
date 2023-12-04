import java.util.*;
public class Game {
    // ArrayList<String> players = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Encounter DIE = new Encounter();
        Player p1 = null;
// If you want to add multiple players
// System.out.println("How many players would you like?")
// int playerNum = scan.nextInt();
/* 
switch(playerNum) {
    case(1):
        Player p1 = null;
    case(2):
        Player p1 = null;
        Player p2 = null;
} 
So on so forth
*/

        System.out.println("Welcome to a DND journey. Pick your character class \n 1. Barbarian \n 2. Bard \n 3. Cleric \n 4. Druid \n 5. Fighter \n 6. Monk \n 7. Paladin \n 8. Ranger \n 9. Rogue \n 10. Sorceror \n 11. Warlock \n 12. Wizard");
        int charClass = scan.nextInt();
        switch(charClass){
            case(1):
                System.out.println("You have chosen Barbarian");  
                p1 = new Barbar();
                break;
            case(2):
                System.out.println("You have chosen Bard");  
                p1 = new Bard();
                break;
            case(3):
                System.out.println("You have chosen Cleric");  
                p1 = new Cleric();
                break;
            case(4):
                System.out.println("You have chosen Druid");  
                p1 = new Druid();
                break;
            case(5):
                System.out.println("You have chosen Fighter");  
                p1 = new Fighter();
                break;
            case(6):
                System.out.println("You have chosen Monk");  
                p1 = new Monk();
                break;
            case(7):
                System.out.println("You have chosen Paladin");  
                p1 = new Paladin();
                break;
            case(8):
                System.out.println("You have chosen Ranger");  
                p1 = new Ranger();
                break;
            case(9):
                System.out.println("You have chosen Rogue");  
                p1 = new Rogue();
                break;
            case(10):
                System.out.println("You have chosen Sorceror");  
                p1 = new Sorceror();
                break;
            case(11):
                System.out.println("You have chosen Warlock");  
                p1 = new Warlock();
                break;
            case(12):
                System.out.println("You have chosen Wizard");  
                p1 = new Wizard();
                break;
            default:
                System.out.println("You are a disappointment!!!");
                System.exit(0);
        }
        // System.out.println(p1.inv.inventoryList); this prints player inventory
        DIE.encountStart();
        System.out.println(p1.inv.inventoryList);
        scan.close();
    }
}
