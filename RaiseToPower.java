/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class RaiseToPower extends ConsoleProgram {
	public void run() {
		/* Sit in a loop reading bases and exponents and printing out the values
		 * produced by raising the base to the exponent.
		 */
		while (true) {
			double base  = readDouble("Enter base: ");
			int exponent = readInt("Enter exponent: ");
			println(base + " ^ " + exponent + " = " + raiseToPower(base, exponent));
		}
	}
	
	//implement the raise power method
	private double raiseToPower(double base, int exponent) {
		/* TODO: Delete this comment and replace the implementation of this method
		 * with the correct implementation.
		 */
		double result = 1.0;
		double expCount =exponent;
		if(exponent < 0){
			expCount = -exponent;
		}
		
		for( int i = 0; i < expCount; i++){
			result *= base;
		}
		if(exponent < 0){
			result = 1.0 / result;
		}
		
		return result;
	}
}
