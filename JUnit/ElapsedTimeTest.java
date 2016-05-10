package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class ElapsedTimeTest {
	
	@Before
	public void setUp() throws Exception {
		System.out.println("EXECUTE");
	}
	
	@BeforeClass
	public static void setUpBeforeClass(){
		System.out.println("EXECUTED AT START");
	}
	
	@After
	public void afterMethod(){
		System.out.println("METHOD FINISHED");
	}
	
	@AfterClass
	public static void afterMethodClass(){
		System.out.println("Test FINISHED");
	}

	@Test
	public void testWithEqualTimes() {
		assertEquals(0, ElapsedTime.elapsedTime(7, 7, 7, 7, "pm", "pm"));
	}
	
	@Test
	public void testEveryStatement() {
		assertEquals(10, ElapsedTime.elapsedTime(12, 30, 12, 40, "pm", "pm"));
	}
	
	@Test
	public void testEveryBranch() {
		assertEquals(10, ElapsedTime.elapsedTime(12, 30, 12, 40, "pm", "pm"));
		assertEquals(134, ElapsedTime.elapsedTime(5, 16, 7, 30, "am", "am"));
	}

}
