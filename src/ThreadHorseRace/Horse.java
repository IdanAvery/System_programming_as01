//Idan Abergel and Sveta Yashenko
package ThreadHorseRace;


public class Horse {
    private String name;
    private int distance;
    private FinishingLine finishLine;

    public Horse(String name, FinishingLine f, int distance){
        name = name;
        distance = distance;
        finishLine = f;
    }

    public void run(){

    }

    public String getHorseName(){return name;}
}
