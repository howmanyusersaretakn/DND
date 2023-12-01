public class Player {
    private int Str;
    private int Dex;
    private int Con;
    private int Intel;
    private int Wis;
    private int Cha;
    Player(int Str, int Dex, int Con, int Intel, int Wis, int Cha){
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
        this.Intel = Intel;
        this.Wis = Wis;
        this.Cha = Cha;
    }
}
/*Barbarian, Bard, Cleric, Druid, Fighter, Monk, Paladin, Ranger, Rogue,
 * Sorceror, Warlock, Wizard*/
class Barbar extends Player{
    Barbar(){
        super(16, 12, 16, 14, 14, 9);
    }

}
class Bard extends Player{
    Bard(){
        super(12, 17, 11, 14, 13, 12);
    }
}
class Cleric extends Player{
    Cleric(){
        super(9, 9, 8, 14, 12, 11);
    }
}
class Druid extends Player{
    Druid(){
        super(14, 13, 8, 10, 15, 17);
    }
}
class Fighter extends Player{
    Fighter(){
        super(12, 11, 14, 13, 11, 8);
    }
}
class Monk extends Player{
    Monk(){
        super(13, 10, 12, 13, 13, 17);
    }
}
class Paladin extends Player{
    Paladin(){
        super(10, 14, 5, 14, 16, 16);
    }
}
class Ranger extends Player{
    Ranger(){
        super(8, 16, 18, 10, 14, 10);
    }
}
class Rogue extends Player{
    Rogue(){
        super(13, 11, 8, 16, 11, 8);
    }
}
class Sorceror extends Player{
    Sorceror(){
        super(15, 10, 18, 12, 16, 14);
    }
}
class Warlock extends Player{
    Warlock(){
        super(4, 11, 16, 15, 8, 10);
    }
}
class Wizard extends Player{
    Wizard(){
        super(15, 15, 14, 17, 8, 7);
    }
}