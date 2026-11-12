package Game;

public class Item {
    private final String name;
    private int value;
    private final boolean isMagical;

    public Item(){
        name = "unknown";
        value = 0;
        isMagical = false;
    }

    public Item(String n, int val, boolean magical){
        name = n;
        value = val;
        isMagical = magical;
    }
    public String toString(){
        return "Name: "+ getName() + "\nValue: "+ getValue() + (isMagical()? "\nMagical item" : "\nNot magical iten");
    }
    public int getValue(){return value;}

    public void setValue(int val){
        value = (val > 0) ? val : 0;
    }
    public boolean isMagical(){return isMagical;}
    public String getName(){return name;}
}
