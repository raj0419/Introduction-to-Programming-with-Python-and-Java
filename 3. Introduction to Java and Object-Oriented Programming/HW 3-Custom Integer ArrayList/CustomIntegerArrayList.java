import java.util.*;
public class CustomIntegerArrayList {
	private ArrayList<Integer> arr;
	public CustomIntegerArrayList() {
		this.arr = new ArrayList<Integer>();
	}
	public CustomIntegerArrayList(ArrayList<Integer> arr) {
		this.arr = new ArrayList<Integer>(arr);
	}
	public ArrayList<Integer> getArrayList() {
		return this.arr;
	}
	public int get(int index) {
		return this.arr.get(index);
	}
	public void add(int element) {
		this.arr.add(element);
	}
	public void add(int index, int element) {
		this.arr.add(index,element);
	}
	public void remove(int index) {
		this.arr.remove(index);
	}
	public void remove(int num, int element) {
		if(num>0 && num<arr.size()) {
			int cnt=num;
			int i=0;
			while(i<this.arr.size() && cnt!=0) {
				if(this.arr.get(i)==element){
					this.arr.remove(i);
					cnt--;
				}
				else{
					i++;
					}

				}
			}
		else if(num>=this.arr.size()) {
			int i=0;
			while(i<this.arr.size()) {
				if(this.arr.get(i)==element) {
					this.arr.remove(i);
				}
				else{
					i++;
				}
			}
		}
	}
	public ArrayList<Integer> splice(int index, int count_element) {
                ArrayList<Integer> empty = new ArrayList<>();
                int noOfDeletion = this.arr.size() - 1 - index;
                if (index < 0 || index >= this.arr.size() || this.arr.size() == 0 || count_element > noOfDeletion
                                || count_element <= 0) {
                        return empty;
                }
                int i = index;
                while (i < this.arr.size() && count_element != 0) {
                        empty.add(i);
                        this.arr.remove(i);
                        count_element--;
                }
                return empty;
}
	 public ArrayList<Integer> splice(int index, int count_element, int[] otherArray) {
                ArrayList<Integer> removedElements = new ArrayList<>();
                if (index < 0 || count_element == 0 || index >= this.arr.size()) {
                        return removedElements;
                }
                int i = index;
                while (i < this.arr.size() && count_element != 0) {
                        removedElements.add(i);
                        this.arr.remove(i);
                        count_element--;
                }
                int j=index;
                int k=0;          
                while(k<otherArray.length) {
                        this.arr.add(j,otherArray[k]);
                        j++;
                        k++;
                }
                return removedElements;
        }
	public static void main(String args[]) {
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		System.out.println(arr1.getArrayList());
		arr1.add(0, 5);
		System.out.println(arr1.getArrayList());
		arr1.remove(2, 2);
		System.out.println(arr1.getArrayList());
		arr1.add(6);
		arr1.add(2);
		arr1.add(7);
		arr1.splice(0, 2);
		System.out.println(arr1.getArrayList());
		arr1.splice(0, 1, new int[] { 4, 5 });
		System.out.println(arr1.getArrayList());
		ArrayList<Integer> arr2Elements = new ArrayList<Integer>();
		arr2Elements.add(5);
		arr2Elements.add(15);
		arr2Elements.add(27);	
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList(arr2Elements);
		System.out.println(arr2.getArrayList());
	}
}