//Idan Abergel and Sveta Yashenko

package Game;

public class GameMain {
    public static void main(String[] args){
    	// created 3 items
        Item sword = new Item("sword", 50, false);
        Item spear = new Item("spear", 45, false);
        Item bow = new Item("bow", 55, true);

        // created 2 players Player(String n, int heal, int lvl)
        Player playerA = new Player("Avery", 10, 2);
        Player playerB = new Player("Sveta", 10, 2);

        // added items to players
        playerA.addItem(bow);
        playerA.addItem(spear);
        playerB.addItem(sword);

        // created  Enemy(String n, int heal, int lvl, int dmg)
        Enemy enemy1 = new Enemy("slime", 35, 1, 20);

        // created game world
        Player[] players = { playerA, playerB };
        Enemy[] enemies = { enemy1 };
        GameWorld world = new GameWorld("MyWorld", players, enemies, 3);

        // print all players
        world.printAllPlayers();

        // print player name and calculateInventoryValue
        System.out.println(playerA.getName() + " inventory value: " + playerA.calculateInventoryValue());
        System.out.println(playerB.getName() + " inventory value: " + playerB.calculateInventoryValue());
        
        //simulation of encaunter
        world.simulateBattle(playerA, enemy1);
      
        
        
        
      }
    
    
    
    
    
}
    