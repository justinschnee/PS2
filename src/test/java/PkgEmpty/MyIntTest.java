package PkgEmpty;

import static org.junit.Assert.*;


import PkgEmpty.MyInteger;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyIntTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	MyInteger testcase = new MyInteger(4);
	MyInteger testcase2 = new MyInteger(3);

	@Test
	public void testMyInteger() {

		assertEquals(4, testcase.getValue());
		assertEquals(3, testcase2.getValue());

	}

	@Test
	public void testIsEven1() {
		assertEquals(true, testcase.isEven());
		assertEquals(false, testcase2.isEven());

	}

	@Test
	public void testIsOdd() {
		assertEquals(false, testcase.isOdd());
		assertEquals(true, testcase2.isOdd());
	}

	@Test
	public void testIsPrime() {
		assertEquals(false, testcase.isPrime());
		assertEquals(true, testcase2.isPrime());
	}


	@Test
	public void testIsOddint() {
		assertEquals(false, MyInteger.isOdd(6));
		assertEquals(true, MyInteger.isOdd(11));
	}

	@Test
	public void testIsPrimeint() {
		assertEquals(false, MyInteger.isPrime(6));
		assertEquals(true, MyInteger.isPrime(1));
	}

	@Test
	public void testIsEven() {
		assertEquals(true, MyInteger.isEven(testcase));
		assertEquals(false, MyInteger.isEven(testcase2));
	}

	@Test
	public void testIsOddMI() {
		assertEquals(false, MyInteger.isOdd(testcase));
		assertEquals(true, MyInteger.isOdd(testcase2));
	}

	@Test
	public void testIsPrimeMI() {
		assertEquals(false, MyInteger.isPrime(testcase));
		assertEquals(true, MyInteger.isPrime(testcase2));
	}

	@Test
	public void testEqualsInt() {
		assertEquals(true, testcase.equals(4));
		assertEquals(false, testcase2.equals(30));

	}

	@Test
	public void testEqualsMI() {
		assertEquals(true, testcase.equals(4));
		assertEquals(false, testcase2.equals(100));
	}
}
