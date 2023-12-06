public class Enemy {
    protected int Str;
    protected int Dex;
    protected int Con;
    protected int Intel;
    protected int Wis;
    protected int Cha;
    protected int hp;
    static String[] tiny = {"Badger(0)", "Crawling Claw(0)", "Demilich(18)", "Faerie Dragon(1)", "Flameskull(4)", "Homunculus(0)", "Intellect Devourer(2)", "Pseudodragon(1/4)"};
    static String[] small = {"Darkmantle(1/2)", "Flying Sword(1/4)", "Giant Centipede(1/4)", "Winged Kobold(1/4)", "Awakened Shrub(0)"};
    static String[] med = {"Acolyte(1/4)", "Animated Armor(1)", "Archmage(12)", "Doppleganger(3)", "Bandit(1/8)", "Bandit Captain(2)", "Berserker(2)", "Blue Dragon Wyrmling(3)", "Death Knight(17)", "Drow Mage(7)"};
    static String[] large = {"Chimera(6)", "Dao(11)", "Dire Wolf(1)", "Giant Owl(1/4)", "Gorgon(5)", "Grick Alpha(7)", "Griffon(2)", "Minotaur(3)", "Owlbear(3)", "Pegasus(2)", "Wyvern(6)"};
    static String[] huge = {"Tyrannosaurus Rex(8)", "Treant(9)", "Stone Giant(7)", "Storm Giant(13)", "Hydra(8)", "Goristro(17)", "Giant Constrictor Snake(2)", "Frost Giant(8)", "Empyrean(23)", "Balor(19)", "Behir(11)", "Adult Green Dragon(15)"};
    static String[] gargant = {""};
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
class Chimera extends LargeEnemy{
    Chimera(){
        super(19,11,19,3,14,10,114);
    }
}
class Dao extends LargeEnemy{
    Dao(){
        super(23,12,24,12,13,14,187);
    }
}
class DireWolf extends LargeEnemy{
    DireWolf(){
        super(17,15,15,3,12,7,37);
    }
}
class GiantOwl extends LargeEnemy{
    GiantOwl(){
        super(13,15,12,8,13,10,19);
    }
}
class Gorgon extends LargeEnemy{
    Gorgon(){
        super(20,11,18,2,12,7,114);
    }
}
class GrickAlpha extends LargeEnemy{
    GrickAlpha(){
        super(18,16,15,4,14,9,75);
    }
}
class Griffon extends LargeEnemy{
    Griffon(){
        super(18,15,16,2,13,8,59);
    }
}
class Minotaur extends LargeEnemy{
    Minotaur(){
        super(18,11,16,6,16,9,76);
    }
}
class OwlBear extends LargeEnemy{
    OwlBear(){
        super(20,12,17,3,12,7,59);
    }
}
class Pegasus extends LargeEnemy{
    Pegasus(){
        super(18,15,16,10,15,13,59);
    }
}
class Wyvern extends LargeEnemy{
    Wyvern(){
        super(19,10,16,5,12,6,110);
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
class tRex extends HugeEnemy{
    tRex(){
        super(25,10,19,2,12,9,136);
    }
}
class Treant extends HugeEnemy{
    Treant(){
        super(23,8,21,12,16,12,138);
    }
}
class StoneGiant extends HugeEnemy{
    StoneGiant(){
        super(23,15,20,10,12,9,126);
    }
}
class StormGiant extends HugeEnemy{
    StormGiant(){
        super(23,14,20,16,18,18,230);
    }
}
class Hydra extends HugeEnemy{
    Hydra(){
        super(20,12,20,2,10,7,172);
    }
}
class Goristro extends HugeEnemy{
    Goristro(){
        super(25,11,25,6,13,14,310);
    }
}
class GiantConstrictSnake extends HugeEnemy{
    GiantConstrictSnake(){
        super(19,14,12,1,10,3,60);
    }
}
class FrostGiant extends HugeEnemy{
    FrostGiant(){
        super(23,9,21,9,10,12,138);
    }
}
class Empyrean extends HugeEnemy{
    Empyrean(){
        super(30,21,30,21,22,27,313);
    }
}
class Balor extends HugeEnemy{
    Balor(){
        super(26,15,22,20,16,22,262);
    }
}
class Behir extends HugeEnemy{
    Behir(){
        super(23,16,18,7,14,12,168);
    }
}
class AdultGreenDragon extends HugeEnemy{
    AdultGreenDragon(){
        super(23,12,21,18,15,17,207);
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













