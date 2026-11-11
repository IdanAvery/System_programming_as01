package Game;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Player extends Character{
    private Item[] inventory;

    public Player(String n, int heal, int lvl){
        super(n, heal, lvl);
        Item[] inventory = new Item[0];
    }

    public Player (String n, int heal, int lvl, Item[] items){
        super(n, heal, lvl);
        Item[] inventory = items;
    }
    public void addItem(Item item){
        inventory = Arrays.copyOf(inventory, inventory.length +1);
        inventory[inventory.length - 1] = item;
    }
    public int calculateInventoryValue(){
        int totalValue = 0;
        for(Item item : inventory){
            totalValue += item.getValue();
        }
        return totalValue;
    }
    public boolean hasMagicalItem(){
        for(Item item : inventory){
            if (item.isMagical()) return true;
        }
        return false;
    }
    //assisting function
    public String getInventoryNames(Item[] inventory){
        return Arrays.stream(inventory).map(Item::getName).collect(Collectors.joining(" | "));
    }

    public String toString(){
        String inventoryNames = getInventoryNames(inventory);
        return super.toString() + "\nInventory: " + inventoryNames;
    }
}
