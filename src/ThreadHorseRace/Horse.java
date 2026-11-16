//Idan Abergel and Sveta Yashenko
package ThreadHorseRace;
import java.util.Random;


public class Horse extends Thread{
    private String name;
    private int distance;
    private FinishingLine finishLine;

    public Horse(String name, FinishingLine f, int distance){
        this.name = name;
        this.distance = distance;
        this.finishLine = f;
    }

    public void run(){
    	Random rand = new Random();
    	while(distance > 0) {
    		while (distance > 0) {
                try {
                  
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                
                int step = rand.nextInt(20) + 1;
                distance -= step;

                
                if (distance < 0) {
                    distance = 0;
                }

                
                System.out.println(name + " distance left: " + distance);
            }

            
    		finishLine.arrive(this);
        }
    	}

    public String getHorseName(){return name;}
}
