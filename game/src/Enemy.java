public class Enemy {
    protected int Str;
    protected int Dex;
    protected int Con;
    protected int Intel;
    protected int Wis;
    protected int Cha;
    protected int hp;
    static String[] tiny = {"Badger(cr0)", "Crawling Claw(0)", "Demilich(18)", "Faerie Dragon(1)", "Flameskull(4)", "Homunculus(0)", "Intellect Devourer(2)", "Pseudodragon(1/4)"};
    static String[] small = {"Darkmantle(1/2)", "Flying Sword(1/4)", "Giant Centipede(1/4)", "Winged Kobold(1/4)", "Awakened Shrub(0)"};
    static String[] med = {"Acolyte(cr1/4)", "Animated Armor(1)", "Archmage(12)", "Doppleganger(3)", "Bandit(1/8)", "Bandit Captain(2)", "Berserker(2)", "Blue Dragon Wyrmling(3)", "Death Knight(17)", "Drow Mage(7)"};
    // String[] large = {};
    // String[] huge = {};
    // String[] gargant = {};
}

// TINY ENEMIES
class TinyEnemy extends Enemy{
    TinyEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int hp){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.hp = hp;    
    }
}
class Badger extends TinyEnemy{
    Badger(){
        super(4, 11, 12, 2, 12, 5, 3);
    }
    public String toString(){
        return "Badger";
    }
}
class ClawCrawl extends TinyEnemy{
    ClawCrawl(){
        super(13, 14, 11, 5, 10, 4, 2);
    }
    public String toString(){
        return "Crawling Claw";
    }
}
class Demilich extends TinyEnemy{
    Demilich(){
        super(1, 20, 10, 20, 17, 20, 80);
    }
    public String toString(){
        return "Demilich";
    }
}
class DragonFae extends TinyEnemy{
    DragonFae(){
        super(3, 20, 13, 14, 12, 16, 14);
    }
    public String toString(){
        return "Faerie Dragon";
    }
}
class FlameSkull extends TinyEnemy{
    FlameSkull(){
        super(1, 17, 14, 16, 10, 11, 40);
    }
    public String toString(){
        return "Flameskull";
    }
}
class Homunculus extends TinyEnemy{
    Homunculus(){
        super(1,17,14,16,10,11,40);
    }
    public String toString(){
        return "Homunculus";
    }
}
class DevourIntel extends TinyEnemy{
    DevourIntel(){
        super(6,14,13,12,11,10,21);
    }
    public String toString(){
        return "Intellect Devourer";
    }
}
class PseudoDragon extends TinyEnemy{
    PseudoDragon(){
        super(6,15,13,10,12,10,7);
    }
    public String toString(){
        return "Pseudodragon";
    }
}

// SMALL ENEMIES
class SmallEnemy extends Enemy{
    SmallEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int hp){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.hp = hp;    
    }
}
class DarkMantle extends SmallEnemy{
    DarkMantle(){
        super(16, 12, 13, 2, 10, 5, 22);
    }
}
class SwordFly extends SmallEnemy{
    SwordFly(){
        super(12, 15, 11, 1, 5, 1, 17);
    }
}
class CentiGiant extends SmallEnemy{
    CentiGiant(){
        super(5, 14, 12, 1, 7, 3, 4);
    }
}
class KoboldWing extends SmallEnemy{
    KoboldWing(){
        super(7, 16, 9, 8, 7, 8, 7);
    }
}
class ShrubAwake extends SmallEnemy{
    ShrubAwake(){
        super(3, 8, 11, 10, 10, 6, 10)
    }
}

// MEDIUM ENEMIES
class MedEnemy extends Enemy{
    MedEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int hp){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.hp = hp;    
    }
}
class Acolyte extends MedEnemy{
    Acolyte(){
        super(10, 10, 10, 10, 14, 11, 9);
    }
}
class ArmorAnim extends MedEnemy{
    ArmorAnim(){
        super(14, 11, 13, 1, 3, 1, 33);
    }
}
class ArchMage extends MedEnemy{
    ArchMage(){
        super(10, 14, 12, 20, 15, 16, 99);
    }
}
class DoppleGang extends MedEnemy{
    DoppleGang(){
        super(11, 18, 14, 11, 12, 14, 52);
    }
}
class Bandit extends MedEnemy{
    Bandit(){
        super(11,12,12,10,10,10,11);
    }
}
class CaptBandit extends MedEnemy{
    CaptBandit(){
        super(15,16,14,14,11,14,65);
    }
}
class Berserker extends MedEnemy{
    Berserker(){
        super(16,12,17,9,11,9,67);
    }
}
class BlueDragonWyrm extends MedEnemy{
    BlueDragonWyrm(){
        super(17,10,15,12,11,15,52);
    }
}
class DeathKnight extends MedEnemy{
    DeathKnight(){
        super(20,11,20,12,16,18,180);
    }
}
class DrowMage extends MedEnemy{
    DrowMage(){
        super(9,14,10,17,13,12,45);
    }
}

// LARGE ENEMIES
class LargeEnemy extends Enemy{
    LargeEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int hp){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.hp = hp;    
    }
}

// HUGE ENEMIES
class HugeEnemy extends Enemy{
    HugeEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int hp){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.hp = hp;    
    }
}

// GARGANTUAN ENEMIES
class GargEnemy extends Enemy{
    GargEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int hp){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.hp = hp;    
    }
}












