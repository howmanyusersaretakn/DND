public class Enemy {
    protected int Str;
    protected int Dex;
    protected int Con;
    protected int Intel;
    protected int Wis;
    protected int Cha;
    protected int Hp;
    protected int Cr;
    static String[] tiny = {"Badger", "Crawling Claw", "Demilich", "Faerie Dragon", "Flameskull", "Homunculus", "Intellect Devourer", "Pseudodragon"};
    static String[] small = {"Darkmantle", "Flying Sword", "Giant Centipede", "Winged Kobold", "Awakened Shrub"};
    static String[] med = {"Acolyte", "Animated Armor", "Archmage", "Doppleganger", "Bandit", "Bandit Captain", "Berserker", "Blue Dragon Wyrmling", "Death Knight", "Drow Mage"};
    static String[] large = {"Chimera", "Dao", "Dire Wolf", "Giant Owl", "Gorgon", "Grick Alpha", "Griffon", "Minotaur", "Owlbear", "Pegasus", "Wyvern"};
    static String[] huge = {"Tyrannosaurus Rex", "Treant", "Stone Giant", "Storm Giant", "Hydra", "Goristro", "Giant Constrictor Snake", "Frost Giant", "Empyrean", "Balor", "Behir", "Adult Green Dragon"};
    static String[] gargant = {"Kraken", "Dragon Turtle", "Ancient Silver Dragon", "Ancient White Dragon"};
}

// TINY ENEMIES
class TinyEnemy extends Enemy{
    TinyEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int Hp, int Cr){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.Hp = Hp;
        this.Cr = Cr;    
    }
}
class Badger extends TinyEnemy{
    Badger(){
        super(4, 11, 12, 2, 12, 5, 3, 0);
    }
    public String toString(){
        return "Badger";
    }
}
class ClawCrawl extends TinyEnemy{
    ClawCrawl(){
        super(13, 14, 11, 5, 10, 4, 2, 0);
    }
    public String toString(){
        return "Crawling Claw";
    }
}
class Demilich extends TinyEnemy{
    Demilich(){
        super(1, 20, 10, 20, 17, 20, 80, 18);
    }
    public String toString(){
        return "Demilich";
    }
}
class DragonFae extends TinyEnemy{
    DragonFae(){
        super(3, 20, 13, 14, 12, 16, 14, 1);
    }
    public String toString(){
        return "Faerie Dragon";
    }
}
class FlameSkull extends TinyEnemy{
    FlameSkull(){
        super(1, 17, 14, 16, 10, 11, 40, 4);
    }
    public String toString(){
        return "Flameskull";
    }
}
class Homunculus extends TinyEnemy{
    Homunculus(){
        super(1,17,14,16,10,11,40, 0);
    }
    public String toString(){
        return "Homunculus";
    }
}
class DevourIntel extends TinyEnemy{
    DevourIntel(){
        super(6,14,13,12,11,10,21, 2);
    }
    public String toString(){
        return "Intellect Devourer";
    }
}
class PseudoDragon extends TinyEnemy{
    PseudoDragon(){
        super(6,15,13,10,12,10,7, 1);
    }
    public String toString(){
        return "Pseudodragon";
    }
}

// SMALL ENEMIES
class SmallEnemy extends Enemy{
    SmallEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int Hp, int Cr){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.Hp = Hp;   
        this.Cr = Cr;
    }
}
class DarkMantle extends SmallEnemy{
    DarkMantle(){
        super(16, 12, 13, 2, 10, 5, 22, 1);
    }
    public String toString(){
        return "Dark Mantle";
    }
}
class SwordFly extends SmallEnemy{
    SwordFly(){
        super(12, 15, 11, 1, 5, 1, 17, 1);
    }
    public String toString(){
        return "Flying Sword";
    }
}
class CentiGiant extends SmallEnemy{
    CentiGiant(){
        super(5, 14, 12, 1, 7, 3, 4, 1);
    }
    public String toString(){
        return "Giant Centipede";
    }
}
class KoboldWing extends SmallEnemy{
    KoboldWing(){
        super(7, 16, 9, 8, 7, 8, 7, 1);
    }
    public String toString(){
        return "Winged Kobold";
    }
}
class ShrubAwake extends SmallEnemy{
    ShrubAwake(){
        super(3, 8, 11, 10, 10, 6, 10, 0)
    }
    public String toString(){
        return "Awakened Shrub";
    }
}

// MEDIUM ENEMIES
class MedEnemy extends Enemy{
    MedEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int Hp, int Cr){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.Hp = Hp;    
        this.Cr = Cr;
    }
}
class Acolyte extends MedEnemy{
    Acolyte(){
        super(10, 10, 10, 10, 14, 11, 9, 1);
    }
    public String toString(){
        return "Acolyte";
    }
}
class ArmorAnim extends MedEnemy{
    ArmorAnim(){
        super(14, 11, 13, 1, 3, 1, 33, 1);
    }
    public String toString(){
        return "Animated Armor";
    }
}
class ArchMage extends MedEnemy{
    ArchMage(){
        super(10, 14, 12, 20, 15, 16, 99, 12);
    }
    public String toString(){
        return "Archmage";
    }
}
class DoppleGang extends MedEnemy{
    DoppleGang(){
        super(11, 18, 14, 11, 12, 14, 52, 3);
    }
    public String toString(){
        return "Doppleganger";
    }
}
class Bandit extends MedEnemy{
    Bandit(){
        super(11,12,12,10,10,10,11,1);
    }
    public String toString(){
        return "Bandit";
    }
}
class CaptBandit extends MedEnemy{
    CaptBandit(){
        super(15,16,14,14,11,14,65,2);
    }
    public String toString(){
        return "Bandit Captain";
    }
}
class Berserker extends MedEnemy{
    Berserker(){
        super(16,12,17,9,11,9,67,2);
    }
    public String toString(){
        return "Berserker";
    }
}
class BlueDragonWyrm extends MedEnemy{
    BlueDragonWyrm(){
        super(17,10,15,12,11,15,52,3);
    }
    public String toString(){
        return "Blue Dragon Wyrmling";
    }
}
class DeathKnight extends MedEnemy{
    DeathKnight(){
        super(20,11,20,12,16,18,180,1);
    }
    public String toString(){
        return "Death Knight";
    }
}
class DrowMage extends MedEnemy{
    DrowMage(){
        super(9,14,10,17,13,12,45,7);
    }
    public String toString(){
        return "Drow Mage";
    }
}

// LARGE ENEMIES
class LargeEnemy extends Enemy{
    LargeEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int Hp, int Cr){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.Hp = Hp;    
        this.Cr = Cr;
    }
}
class Chimera extends LargeEnemy{
    Chimera(){
        super(19,11,19,3,14,10,114,6);
    }
    public String toString(){
        return "Chimera";
    }
}
class Dao extends LargeEnemy{
    Dao(){
        super(23,12,24,12,13,14,187,11);
    }
    public String toString(){
        return "Dao";
    }
}
class DireWolf extends LargeEnemy{
    DireWolf(){
        super(17,15,15,3,12,7,37,1);
    }
    public String toString(){
        return "Dire Wolf";
    }
}
class GiantOwl extends LargeEnemy{
    GiantOwl(){
        super(13,15,12,8,13,10,19,1);
    }
    public String toString(){
        return "Giant Owl";
    }
}
class Gorgon extends LargeEnemy{
    Gorgon(){
        super(20,11,18,2,12,7,114,5);
    }
    public String toString(){
        return "Gorgon";
    }
}
class GrickAlpha extends LargeEnemy{
    GrickAlpha(){
        super(18,16,15,4,14,9,75,7);
    }
    public String toString(){
        return "Grick Alpha";
    }
}
class Griffon extends LargeEnemy{
    Griffon(){
        super(18,15,16,2,13,8,59,2);
    }
    public String toString(){
        return "Griffon";
    }
}
class Minotaur extends LargeEnemy{
    Minotaur(){
        super(18,11,16,6,16,9,76,3);
    }
    public String toString(){
        return "Minotaur";
    }
}
class OwlBear extends LargeEnemy{
    OwlBear(){
        super(20,12,17,3,12,7,59,3);
    }
    public String toString(){
        return "Owlbear";
    }
}
class Pegasus extends LargeEnemy{
    Pegasus(){
        super(18,15,16,10,15,13,59,2);
    }
    public String toString(){
        return "Pegasus";
    }
}
class Wyvern extends LargeEnemy{
    Wyvern(){
        super(19,10,16,5,12,6,110,6);
    }
    public String toString(){
        return "Wyvern";
    }
}

// HUGE ENEMIES
class HugeEnemy extends Enemy{
    HugeEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int Hp, int Cr){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.Hp = Hp;    
        this.Cr = Cr;
    }
}
class TRex extends HugeEnemy{
    TRex(){
        super(25,10,19,2,12,9,136,8);
    }
    public String toString(){
        return "Tyrannosaurus Rex";
    }
}
class Treant extends HugeEnemy{
    Treant(){
        super(23,8,21,12,16,12,138,9);
    }
    public String toString(){
        return "Treant";
    }
}
class StoneGiant extends HugeEnemy{
    StoneGiant(){
        super(23,15,20,10,12,9,126,7);
    }
    public String toString(){
        return "Stone Giant";
    }
}
class StormGiant extends HugeEnemy{
    StormGiant(){
        super(23,14,20,16,18,18,230,13);
    }
    public String toString(){
        return "Storm Giant";
    }
}
class Hydra extends HugeEnemy{
    Hydra(){
        super(20,12,20,2,10,7,172,8);
    }
    public String toString(){
        return "Hydra";
    }
}
class Goristro extends HugeEnemy{
    Goristro(){
        super(25,11,25,6,13,14,310,17);
    }
    public String toString(){
        return "Goristro";
    }
}
class GiantConstrictSnake extends HugeEnemy{
    GiantConstrictSnake(){
        super(19,14,12,1,10,3,60,2);
    }
    public String toString(){
        return "Giant Constrictor Snake";
    }
}
class FrostGiant extends HugeEnemy{
    FrostGiant(){
        super(23,9,21,9,10,12,138,8);
    }
    public String toString(){
        return "Frost Giant";
    }
}
class Empyrean extends HugeEnemy{
    Empyrean(){
        super(30,21,30,21,22,27,313,23);
    }
    public String toString(){
        return "Empyrean";
    }
}
class Balor extends HugeEnemy{
    Balor(){
        super(26,15,22,20,16,22,262,19);
    }
    public String toString(){
        return "Balor";
    }
}
class Behir extends HugeEnemy{
    Behir(){
        super(23,16,18,7,14,12,168,11);
    }
    public String toString(){
        return "Behir";
    }
}
class AdultGreenDragon extends HugeEnemy{
    AdultGreenDragon(){
        super(23,12,21,18,15,17,207,15);
    }
    public String toString(){
        return "Adult Green Dragon";
    }
}

// // GARGANTUAN ENEMIES
// class GargEnemy extends Enemy{
//     GargEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int Hp, int Cr){
//         this.Str = Str;
//         this.Dex = Dex;
//         this.Con = Con;
//         this.Intel = Intel;
//         this.Wis = Wis;
//         this.Cha = Cha;
//         this.Hp = Hp;    
//         this.Cr = Cr;
//     }
// }













