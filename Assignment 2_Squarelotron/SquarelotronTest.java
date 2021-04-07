package exception;

import java.util.Arrays;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquarelotronTest {
    private Squarelotron square3x;

    
    
	@BeforeEach
	void setUp(){
        square3x=new Squarelotron(3);
	}

	
	
	@Test
	void testSquarelotron() {
		assertEquals(3,square3x.size,0);
		
		int[][] compare1=new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		assertArrayEquals(compare1,square3x);
	}

	
	
	@Test
	void testUpsideDownFlip() {
		int[][] compare2=new int[][] {
			{7,8,9},
			{4,5,6},
			{1,2,3}
		};
		assertArrayEquals(compare2,square3x.upsideDownFlip(1));
	}

	
	
	@Test
	void testMainDiagonalFlip() {
		int[][] compare3=new int[][] {
			{1,4,7},
			{2,5,8},
			{3,6,9}
		};
		
		assertArrayEquals(compare3,square3x.mainDiagonalFlip(1));
	}
		
	
	
	
	@Test
	void testRotateRight() {
		int[][] compare4=new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		assertArrayEquals(compare4,square3x.rotateRight(0));
		
		int[][] compare5=new int[][] {
			{3,6,9},
			{2,5,8},
			{1,4,7}
		};
		assertArrayEquals(compare5,square3x.rotateRight(-1));
		
	}

}
