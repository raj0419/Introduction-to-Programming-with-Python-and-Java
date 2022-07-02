import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
public class ArrayAndArrayList {
	public static int howMany(int[] array, int element) {
		int count=0;
		for(int i=0;i<array.length;i++) {
			if (array[i]==element) {
				count++;
			}
		}
		return count;
	}
	public static int findMax(int[] array) {
		int max;
		if(array.length==0) {
			max=-1;
		}
		else {
		max=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		}
		return max;
	}
	public static ArrayList<Integer> maxArray(int[] array) {   
		int max=findMax(array);
		if(max==-1) {
			return null;
		}
		else {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			if(array[i]==max) {
				list.add(array[i]);
			}
		}
		return(list);
		}
	}
	public static int[] swapZero(int[] array) {
		int count = 0;
		 int n=array.length;
        for (int i = 0; i < n; i++)
            if (array[i] != 0)
                array[count++] = array[i];
        while (count < n)
            array[count++] = 0;
		
        return array;
	}
	public static void main(String[] args) {
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		System.out.println(howMany(array,1));
		System.out.println(findMax(array));
		System.out.println(maxArray(array));
		int[] arr2= {2,0,1,4,0,6,0,7};
		int[] a= swapZero(arr2);
		for (int i = 0; i < a.length; i++)  
			System.out.print( a[i]+ " ");     
	}
}