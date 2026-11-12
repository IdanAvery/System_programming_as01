package Game;
import java.util.Arrays;

public class GameWorld {
    private final String name;
    private Player[] players;
    private Enemy[] enemies;
    private final int difficulty;

    public GameWorld(){
        name = "Crystalpath";
        players = new Player[0];
        enemies = new Enemy[0];
        difficulty = 1;
    }

    public GameWorld(String n, Player[] pList, Enemy[] eList, int diff){
        name = n;
        players = pList;
        enemies = eList;
        if (diff == 1 || diff == 2 || diff == 3) difficulty = diff;
        else difficulty = 1; //default
    }


    public void addPlayer(Player player){
        for (int i = 0; i < players.length; i++){
            if (players[i] == null) {
                players[i] = player;
                return;
            }
        }
        players = Arrays.copyOf(players, players.length + 1);
        players[players.length-1] = player;
    }
    public void printAllPlayers(){
        for (Player p : players){
            System.out.println(p.toString());
        }
    }

    public int getTotalValueOfWorld(){
        int totalValue = 0;
        for (Player p : players){
            totalValue += p.calculateInventoryValue();
        }
        return totalValue;
    }
    public void simulateBattle(Player p, Enemy e) {
	    String ename = e.getName();
	    String pname = p.getName();
    System.out.println(pname + " VS " + ename);
        if(p.getLevel() < e.getLevel()) {
    	      System.out.println(ename + " WINS!");
    	      e.levelUp();
       }else {
    	      System.out.println(pname + " WINS!");
    	      p.levelUp();
    	   
       }
   }

    
    public String toString(){
        return "World Name: " + name + "\nDifficulty: " + difficulty + "\nNumber of Players: " + players.length;
    }
}
