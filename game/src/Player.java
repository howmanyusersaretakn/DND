import java.util.*;
public class Player {
    private int Str;
    private int Dex;
    private int Con;
    private int Intel;
    private int Wis;
    private int Cha;
    private int Hp;
    private String name;
    ArrayList<String> Attacks = new ArrayList<String>();
    Inventory inv = new Inventory();
    Player(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int Hp){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.Hp = Hp;
    }

    public String toString() {
        return "Strength: " + this.Str + ", Dexterity: " + this.Dex + ", Constitution: " + this.Con + ", Intelligence: " + this.Intel + ", Wisdom: " + this.Wis + ", Charisma:" + this.Cha + ", HP: " + this.Hp;
    }

    // public String inventoryPrint(){
    //     return this.inv;
    // }
}
/*Establishing Class stats and unique weapon/equipment (Barbarian, Bard, Cleric, Druid, Fighter, Monk, Paladin, Ranger, Rogue,
 * Sorceror, Warlock, Wizard)*/
class Barbar extends Player{
    Barbar(){
        super(16, 12, 16, 14, 14, 9, 15);
        inv.inventoryBasic();
        inv.inventoryAdd("Great Axe");
        inv.inventoryAdd("Longsword");
        inv.inventoryAdd("Javelin");
        Collections.addAll(Attacks, "", "");

    } 

    public String toString() { 
        return "Barbar Stats: " + super.toString();
    }

}
class Bard extends Player{
    Bard(){
        super(12, 17, 11, 14, 13, 12, 8);
        inv.inventoryBasic();
        inv.inventoryAdd("Lute");
        inv.inventoryAdd("Rapier");
    }

    public String toString() { 
        return "Bard Stats: " + super.toString();
    }
}
class Cleric extends Player{
    Cleric(){
        super(9, 9, 8, 14, 12, 11, 7);
        inv.inventoryBasic();
        inv.inventoryAdd("Mace");
        inv.inventoryAdd("Light Crossbow");
        inv.inventoryAdd("20 bolts");
        inv.inventoryAdd("Shield");
        inv.inventoryAdd("Cross");
    }

    public String toString() { 
        return "Cleric Stats: " + super.toString();
    }
}
class Druid extends Player{
    Druid(){
        super(14, 13, 8, 10, 15, 17, 7);
        inv.inventoryBasic();
        inv.inventoryAdd("Scimitar");
        inv.inventoryAdd("Wooden Shield");
    }
}
class Fighter extends Player{
    Fighter(){
        super(12, 11, 14, 13, 11, 8, 12);
        inv.inventoryBasic();
        inv.inventoryAdd("Poleaxe");
        inv.inventoryAdd("Light Crossbow");
        inv.inventoryAdd("20 bolts");
    }
}
class Monk extends Player{
    Monk(){
        super(13, 10, 12, 13, 13, 17, 9);
        inv.inventoryBasic();
        inv.inventoryAdd("Spear");
        inv.inventoryAdd("10 darts");
    }
}
class Paladin extends Player{
    Paladin(){
        super(10, 14, 5, 14, 16, 16, 7);
        inv.inventoryAdd("Longsword");
        inv.inventoryAdd("Shield");
        
    }
}
class Ranger extends Player{
    Ranger(){
        super(8, 16, 18, 10, 14, 10, 14);
        inv.inventoryAdd("Longbow");
        inv.inventoryAdd("Shortsword");
    }
}
class Rogue extends Player{
    Rogue(){
        super(13, 11, 8, 16, 11, 8, 9);
        inv.inventoryAdd("Longbow");
        inv.inventoryAdd("Rapier");
    }
}
class Sorceror extends Player{
    Sorceror(){
        super(15, 10, 18, 12, 16, 14, 10);
        inv.inventoryAdd("Quarterstave");
        inv.inventoryAdd("Crossbow");
    }
}
class Warlock extends Player{
    Warlock(){
        super(4, 11, 16, 15, 8, 10, 11);
        inv.inventoryAdd("Greatsword");
    }
}
class Wizard extends Player{
    Wizard(){
        super(15, 15, 14, 17, 8, 7, 8);
    }
}
// End of Player Stats