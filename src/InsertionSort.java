
public class InsertionSort {

	public static void main(String[] args) {
		
		int[] nums = {8, 4, 9, -2, 1, 4};
		
		//Note that bc arrays are objects, the method
		//parameter will be an alias which means the
		//method can change the array
		insertionSort(nums);
		
		//Display the sorted array
		for(int value : nums) {
			System.out.println(value);
		}

	}
	
	public static void insertionSort(int[] arr) {
		//We assume the first element is sorted, so we
		//begin at the second element and go to the end
		for(int index = 1; index < arr.length; index++) {
			//Select the element as the key
			//The item to be inserted at the end
			int toInsert = arr[index];
			//Set position to the last sorted item
			int sortedIndex = index - 1; 
			//Keep shifting the elements until we find the correct insertion
			//spot or hit the front of the list
			while(sortedIndex >= 0 && arr[sortedIndex] > toInsert) {
				arr[sortedIndex + 1] = arr[sortedIndex];
				sortedIndex--;
			}
			//Insert the element
			arr[sortedIndex + 1] = toInsert;		
		}
	}

}
