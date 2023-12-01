import java.util.*;
public class Encounter{
    public static void main(String args[]){
        Random rand = new Random();
        while(true){
            int enc = rand.nextInt(21);
            System.out.println(enc);
            if(enc == 20){
                System.out.println("You've been attacked!");
                break;
            }
        }
    }



}
