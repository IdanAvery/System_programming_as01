//Idan Abergel 208055665
// Sveta Yashenko 323922328
package ThreadHorseRace;

public class FinishingLine {
	
	private int place = 1;
	
    public void arrive (Horse h){
    	System.out.println(h.getHorseName() + " arrived at the finish line! Place: " + place);
    place++;

    }
    
    
}
