/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class AerobicExercise extends ConsoleProgram {
	
	
	//these are the indices for the two var cardio and blood
	private int cardioIndex = 0;
	private int bloodIndex = 0;
	
	public void run() {
	
		
		
		for(int day = 1; day <=7; day++){
			
			int x = readInt("How many minutes of aerobic exercise did you do on day " + day + "? ");
			checkCardio(x);
			checkBlood(x);
			
		}
		resultPrint();
	}
	
	//adds counter to cardio if valid
	private void checkCardio(int x){
		if( x >= 30){
			cardioIndex++;
		}
		
	}
	
	//adds counter to blood if valid
	private void checkBlood(int x){
		
		if( x >=40){
			bloodIndex++;
		}
	}
	
	//print the whole result
	private void resultPrint(){
		
		println("Cardiovascular Health");
		if( cardioIndex > 4){
			println("Great Job! You've done enough exercise for cardiovascular health.");
			
		}else{
			int result = 5 - cardioIndex;
			println("You needed 30 or more minutes of aerobic exercise on at least " + result + " more day(s)");
		}
		
		
		println("Blood Pressure");
		if( bloodIndex > 2){
			println("Great Job! You've done enough exercise for low blood pressure.");
		}else{
			int result = 3 - bloodIndex;
			println("You needed 40 or more minutes of aerobic exercise on at least " + result + " more day(s)");
		}
	}
	
	
	
}
