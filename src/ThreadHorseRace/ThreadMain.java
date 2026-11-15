//Idan Abergel and Sveta Yashenko
package ThreadHorseRace;
import java.util.Scanner;

public class ThreadMain  {
	
	//the distance the horses need to pass will be collected from the user
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the distance the horses will pass"); 
    int distance = scan.nextInt();
    
	//here needed to create ten horses - name , distance ,finishline
    FinishingLine f = new FinishingLine();
    
    Horse[] horses = new Horse[10];
    for (int i = 0; i < horses.length; i++) {
        horses[i] = new Horse("H" + (i+1), f, distance);
        horses[i].start(); 
       
    }
    scan.close();
    
	}
	
}
