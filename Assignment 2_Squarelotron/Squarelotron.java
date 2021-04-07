import java.util.*;

//Squarelotron class
public class Squarelotron {
	int[][] Squarelotron;
	int size;
	
	// It fills the 2-dimensional array with the numbers 1 to n squared, in order. 
	//It also sets the size instance variable to be n.
	Squarelotron(int n){
		this.size=n;
		this.Squarelotron=new int[n][n];
		//i=row j=col, len-1
		for(int i=0; i<size;i++) {
			for(int j=0; j<size;j++) {
				Squarelotron[i][j]=j+size*i+1;
			}		
		}
	}
	/*This method performs the Upside-Down Flip of the squarelotron, as described above, 
	and returns the new squarelotron. The original squarelotron should not be modified (we will check for this). */
	//ring=size/2
	public Squarelotron upsideDownFlip(int ring) {
		Squarelotron squarelotron_1= new Squarelotron(this.size);
		for(int i=0; i<size;i++) {
			for(int j=0; j<size;j++) {
				Squarelotron[i][j]=j+size*i+1;
			}		
		}
		if (i == ring-1||i=size-ring||j=ring-1||j=size-ring) {
			squarelotron_1.Squarelotron[i][j]=Squarelotron[size-i-1][j];
		}else {
			squarelotron_1.Squarelotron[i][j]=Squarelotron[i][j];
		}
		return squarelotron_1;
	}
	
	
	/*This method performs the Main Diagonal Flip of the squarelotron, as described above, and returns the new squarelotron.
	 *  The original squarelotron should not be modified (we will check for this).  */
	
	public Squarelotron mainDiagonalFlip(int ring) {
		Squarelotron squarelotron_2= new Squarelotron(this.size);
		for(int i=0; i<size;i++) {
			for(int j=0; j<size;j++) {
				Squarelotron[i][j]=j+size*i+1;
			}		
		}
		if(i == ring-1||i=size-ring||j=ring-1||j=size-ring) {
			squarelotron_2.Squarelotron[i][j]=Squarelotron[j][i];
		}else {
			squarelotron_2.Squarelotron[i][j]=Squarelotron[i][j];
		}
		return squarelotron_2;
	}
	
	
	/*The argument numberOfTurns indicates the number of times the entire squarelotron should be rotated 90� clockwise. 
	 * Any integer, including zero and negative integers, is allowable as the argument. A value of -1 indicates a 90� counterclockwise rotation.
	 *  This method modifies the internal representation of the squarelotron; it does not create a new squarelotron.*/
	
	public void rotateRight(int numberOfTurns) {
        for (int n = 0; n < Math.abs(numberOfTurns); n++) {
            Squarelotron squarelotron_3 = new Squarelotron(this.size);
            for (int i = 0; i < this.size; i++) {
                for (int j = 0; j < this.size; j++) {
                    if (numberOfTurns > 0) {
                    	squarelotron_3.Squarelotron[j][this.size - 1 - i] = this.Squarelotron[i][j];
                    }
                    else {
                    	squarelotron_3.Squarelotron[i][j] = this.Squarelotron[j][this.size - 1 - i];
                    }
                }
            }
            this.Squarelotron = Arrays.copyOf(squarelotron_3.Squarelotron, squarelotron_3.size);
        }
	}

}
