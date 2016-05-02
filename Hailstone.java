/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class Hailstone extends ConsoleProgram {
	
	
	
	private int index = 0;
	
	public void run() {
		
		int n = readInt("Enter a number: ");
		
		
		while(n != 1){
			
			if( n % 2 == 0){
				int newNum = n /2;
				println(n + " is even, so I take half: " + newNum);
				n = newNum;
				index++;
			}else{
				int newNum = 3*n+1;
				println(n + " is odd, so I make 3n+1: " + newNum);
				n = newNum;
				index++;
			}
		}
		println("The process took " + index + " to reach to 1");
		
	}
}

