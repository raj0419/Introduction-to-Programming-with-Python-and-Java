import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
class ArrayAndArrayListTest {

	ArrayAndArrayList myArrayAndArrayList;
	
	@BeforeEach
	void setUp() throws Exception {
		this.myArrayAndArrayList = new ArrayAndArrayList();
	}
	
	@Test
	void testHowMany() {
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(2, ArrayAndArrayList.howMany(array, 1));
		assertFalse( ArrayAndArrayList.howMany(array, 7)==3,"should return 1");
		assertTrue(ArrayAndArrayList.howMany(array, 3)==2);
		assertNotEquals(1, ArrayAndArrayList.howMany(array, 1));
	}
	
	@Test
	void testFindMax() {
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(9, ArrayAndArrayList.findMax(array));
		assertTrue(ArrayAndArrayList.findMax(array)==9);
		assertFalse(ArrayAndArrayList.findMax(array)==3);
		assertNotEquals(1, ArrayAndArrayList.findMax(array));
	}

	@Test
	void testMaxArray() {
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		int[] arr=new int[0];
		ArrayList<Integer> testArrayList = new ArrayList<Integer>();
		ArrayList<Integer> lis = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		testArrayList.add(9);
		lis.add(1);
		list.add(null);
		assertNotEquals(list, ArrayAndArrayList.maxArray(arr));
		assertEquals(testArrayList, ArrayAndArrayList.maxArray(array));
		assertNotEquals(ArrayAndArrayList.maxArray(array),lis);
		assertEquals(null, ArrayAndArrayList.maxArray(arr));
		
		
	}

	@Test
	void testSwapZero() {
		int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
		int[] testArray = {1, 2, 3, 5, 0, 0, 0, 0};
		assertFalse(Arrays.equals(array, testArray));
		int[] a=ArrayAndArrayList.swapZero(array);
		assertTrue(Arrays.equals(a,array));
		ArrayAndArrayList.swapZero(array);
		assertArrayEquals(testArray, array);
		assertTrue(Arrays.equals(a, testArray));
		
	}

}