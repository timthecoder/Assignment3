/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.graphics.*;
import acm.program.*;

public class Pyramid extends GraphicsProgram {
	/** Width of each brick in pixels */
	private static final double BRICK_WIDTH = 30;

	/** Height of each brick in pixels */
	private static final double BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		
		//setting the initial position of pyramid base
		double xMark = getWidth()/2 - (BRICKS_IN_BASE * BRICK_WIDTH)/2;
		double yMark = getHeight() - BRICK_HEIGHT;
		
		
		//call the pyramid method
		buildPyramid(xMark, yMark);
		
	}
	
	private void buildPyramid(double x , double y){
		
		//to control the number of bricks
		int brickIndex = BRICKS_IN_BASE;
		
		//adjust the next marker
		double newxMark = x;
		
		for ( int row = 0 ; row < BRICKS_IN_BASE; row++){
			
			for( int col = 0 ; col < brickIndex; col++ ){
				
				GRect brick = new GRect(newxMark + col * BRICK_WIDTH, y - row *BRICK_HEIGHT, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			brickIndex--;
			newxMark = getWidth()/2 - (brickIndex * BRICK_WIDTH)/2;
		}
	}
}

