package Game;

public class Character {
    private final String name;
    private int health;
    private int level;

    public Character(){
        name = "unknown";
        health = 0;
        level = 0;
    }

    public Character(String n, int heal, int lvl){
        name = n;

        if (heal <= 10 && heal >= 0) health = heal;
        else if (heal < 0) health = 0;
        else health = 10;

        if(lvl <= 5 && lvl >= 0) level = lvl;
        else if (lvl < 0) level = 0;
        else level = 5;
    }

    public String getName(){return name;}
    public int getHealth(){return health;}
    public int getLevel(){return level;}

    public void levelUp(){
        if (level < 5) level++;
        else System.out.println("Already at max level");
    }
    public void heal(int amount){
        if((health + amount) > 10 ) health = 10;
        else health += amount;
    }

    public String toString(){
        return "Name: "+ getName() + "\nHealth: " + getHealth() + "\nLevel: " + getLevel();
    }
}
