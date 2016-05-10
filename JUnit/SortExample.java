package JUnit;

public class SortExample {
	
	public static int[] sort(int[] array){
		
		
		for(int i = 0 ; i < array.length ; i++){

			for(int j = 1 ; j < array.length ; j++){
				if(array[j-1] > array[j]){
					int tmp = array[j-1];
					array[j-1] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
		
		
	}
	
}
