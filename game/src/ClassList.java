import java.util.*;
public class ClassList {
    private String[] classes;
    private String className;

    public ClassList(){
        classes = new String[12];

        classes[0] = "Barbarian";
        classes[1] = "Bard";
        classes[2] = "Cleric";
        classes[3] = "Druid";
        classes[4] = "Fighter";
        classes[5] = "Monk";
        classes[6] = "Paladin";
        classes[7] = "Ranger";
        classes[8] = "Rogue";
        classes[9] = "Sorceror";
        classes[10] = "Warlock";
        classes[11] = "Wizard";
    }
    public void setClass(int index){
        if(index < 0){
            index = 0;
        } else if (index >= classes.length){
            index = classes.length-1;

            className = classes[index];
        }
    }

    public String getClassName(){
        String output = className;
        output = output.substring(0, output.indexOf(" "));
        return output;
    }
}
