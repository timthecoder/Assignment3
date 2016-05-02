/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
import acm.util.RandomGenerator;

import java.util.*;

public class SaintPetersburgGame extends ConsoleProgram {
	
	private int total =0;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int index = 0;
	
	public void run() {
		
		while(total <= 20){
			int addTo = runRound();
			total += addTo;
			println("This game, you earned $" + addTo);
			println("Your total is $"+total);
		}
		
		println("It took " + index + " games to earn $20");
	}
	
	private int runRound(){
		int winning = 1;
		
		while(rgen.nextBoolean()){
			winning *=2;
			
		}
		
		index++;
		return winning;
				
	}
}
