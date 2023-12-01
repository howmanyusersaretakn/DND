import java.util.*;
public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to a DND journey. Pick your character class \n 1. Barbarian \n 2. Bard \n 3. Cleric \n 4. Druid \n 5. Fighter \n 6. Monk \n 7. Paladin \n 8. Ranger \n 9. Rogue \n 10. Sorceror \n 11. Warlock \n 12. Wizard");
        int charClass = scan.nextInt();
        if(charClass == 1){
            System.out.println("You have chosen Barbarian");            
        } else if(charClass == 2){
            System.out.println("You have chosen Bard");
        } else if(charClass == 3){
            System.out.println("You have chosen Cleric");
        } else if(charClass == 4){
            System.out.println("You have chosen Druid");
        } else if(charClass == 5){
            System.out.println("You have chosen Fighter");
        } else if(charClass == 6){
            System.out.println("You have chosen Monk");
        } else if(charClass == 7){
            System.out.println("You have chosen Paladin");   
        } else if(charClass == 8){
            System.out.println("You have chosen Ranger");
        } else if(charClass == 9){
            System.out.println("You have chosen Rogue");
        } else if(charClass == 10){
            System.out.println("You have chosen Sorceror");
        } else if(charClass == 11){
            System.out.println("You have chosen Warlock");
        } else if(charClass == 12){
            System.out.println("You have chosen Wizard");
        }
        scan.close();
    }
}
