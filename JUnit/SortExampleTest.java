package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class SortExampleTest extends TestCase {
	

	@Test
	public void test() {
		int[] array = {10,5,8,2, 12};
		
		int rez[] = SortExample.sort(array); 

		assertArrayEquals(getArray(), rez);
		//fail("Not yet implemented");
	}
	
	public void testOne(){
		int[] array = {0};
		assertArrayEquals(new int[] {0}, SortExample.sort(array));
		//fail("Not yet implemented");
	}

	private int[] getArray() {
		int [] array = {2, 5, 8, 10, 12};
		return array;
	}

}
