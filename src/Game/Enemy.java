package Game;

public class Enemy extends Character{
    private int damage;

    public Enemy(String n, int heal, int lvl, int dmg){
        super(n, heal, lvl);
        if(dmg < 6 && dmg > 0) damage = dmg;
        else if (dmg > 5) damage = 5;
        else damage = 1;
    }

    public  int getDamage(){return damage;}

    public String toString(){
        return super.toString() + "\nDamage: " + getDamage();
    }
}
