public class MediumEnemy {
    private int Str;
    private int Dex;
    private int Con;
    private int Intel;
    private int Wis;
    private int Cha;
    private int hp;
    private float cr;
    public int xp;
    MediumEnemy(int Str, int Dex, int Con, int Intel, int Wis, int Cha, int hp, float cr){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
        this.hp = hp;
        this.cr = cr;
    }
}

class Acolyte extends MediumEnemy{
    Acolyte(){
        super(10, 10, 10, 10, 14, 11, 9, 1/4);
    }
}
class ArmorAni extends MediumEnemy{
    ArmorAni(){
        super(14, 11, 13, 1, 3, 1, 33, 1);
    }
}
class Archmage extends MediumEnemy{
    Archmage(){
        super(10, 14, 12, 20, 15, 16, 99, 12);
    }
}
class Dopple extends MediumEnemy{
    Dopple(){
        super(11, 18, 14, 11, 12, 14, 52, 3);
    }
}
class Bandit extends MediumEnemy{
    Bandit(){
        super(11, 12, 12, 10, 10, 10, 11, 1/8);
    }
}
class BanditCapt extends MediumEnemy{
    BanditCapt(){
        super(15, 16, 14, 14, 11, 14, 65, 2);
    }
}
class Berserker extends MediumEnemy{
    Berserker(){
        super(16, 12, 17, 9, 11, 9, 67, 2);
    }
}
class DrowMage extends MediumEnemy{
    DrowMage(){
        super(9, 14, 10, 17, 13, 12, 45, 7);
    }
}






