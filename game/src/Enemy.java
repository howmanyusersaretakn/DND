public class Enemy {
    protected int Str;
    protected int Dex;
    protected int Con;
    protected int Intel;
    protected int Wis;
    protected int Cha;
    protected int hp;
    String[] tiny = {"Badger", "Crawling Claw", "Demilich", "Faerie Dragon", "Flameskull", "Homunculus", "Intellect Devourer", "Pseudodragon"};
    String[] small = {"Darkmantle", "Flying Sword", "Giant Centipede", "Winged Kobold", "Awakened Shrub"};
    String[] med = {"Acolyte", "Animated Armor", "Archmage", "Doppleganger", "Bandit", "Bandit Captain", "Berserker", "Drow Mage"};
    String[] large = {};
    String[] huge = {};
    String[] gargant = {};
}

// TINY ENEMIES
class tinyEnemy extends Enemy{
    tinyEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int hp){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.hp = hp;    
    }
}

class badger extends tinyEnemy{
    badger(){
        super(4, 11, 12, 2, 12, 5, 3);
    }
}
class clawCrawl extends tinyEnemy{
    clawCrawl(){
        super(13, 14, 11, 5, 10, 4, 2);
    }
}
class demilich extends tinyEnemy{
    demilich(){
        super(1, 20, 10, 20, 17, 20, 80);
    }
}
class dragonFae extends tinyEnemy{
    dragonFae(){
        super(3, 20, 13, 14, 12, 16, 14);
    }
}
class flameskull extends tinyEnemy{
    flameskull(){
        super(1, 17, 14, 16, 10, 11, 40);
    }
}
class homunculus extends tinyEnemy{
    homunculus(){
        super(1,17,14,16,10,11,40);
    }
}
class devourIntel extends tinyEnemy{
    devourIntel(){
        super(6,14,13,12,11,10,21);
    }
}
class pseudodragon extends tinyEnemy{
    pseudodragon(){
        super(6,15,13,10,12,10,7);
    }
}

// SMALL ENEMIES
class smallEnemy extends Enemy{
    smallEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int hp){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.hp = hp;    
    }
}

class darkMantle extends smallEnemy{
    darkMantle(){
        super(16, 12, 13, 2, 10, 5, 22);
    }
}
class swordFly extends smallEnemy{
    swordFly(){
        super(12, 15, 11, 1, 5, 1, 17);
    }
}
class centiGiant extends smallEnemy{
    centiGiant(){
        super(5, 14, 12, 1, 7, 3, 4);
    }
}
class koboldWing extends smallEnemy{
    koboldWing(){
        super(7, 16, 9, 8, 7, 8, 7);
    }
}
class shrubAwake extends smallEnemy{
    shrubAwake(){
        super(3, 8, 11, 10, 10, 6, 10)
    }
}

// MEDIUM ENEMIES
class medEnemy extends Enemy{
    medEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int hp){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.hp = hp;    
    }
}

// LARGE ENEMIES
class largEnemy extends Enemy{
    largEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int hp){
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
class hugeEnemy extends Enemy{
    hugeEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int hp){
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
class gargEnemy extends Enemy{
    gargEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int hp){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.hp = hp;    
    }
}












