//Idan Abergel and Sveta Yashenko
package ThreadHorseRace;

public class FinishingLine {
	
	private int place = 1;
	
    public void arrive (Horse h){
    	System.out.println(h.getHorseName() + " arrived at the finish line! Place: " + place);
    place++;

    }
    
    
}
