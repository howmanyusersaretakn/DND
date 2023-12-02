public class TinyEnemy {
    private int Str;
    private int Dex;
    private int Con;
    private int Intel;
    private int Wis;
    private int Cha;
    private int hp;
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

class Homunculus extends TinyEnemy{
    Homunculus(){
        super(4, 15, 11, 10, 10, 7, 5);
    }
}
class IntelDevour extends TinyEnemy{
    IntelDevour(){
        super(6, 14, 13, 12, 11, 10, 21);
    }
}
class Pseudodragon extends TinyEnemy{
    Pseudodragon(){
        super(6, 15, 13, 10, 12, 10, 7);
    }
}
class CrawlClaw extends TinyEnemy{
    CrawlClaw(){
        super(13, 14, 11, 5, 10, 4, 2);
    }
}


