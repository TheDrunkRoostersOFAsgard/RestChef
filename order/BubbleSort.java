package order;

/**
 * 
 * @author Gerardo Padilla (Colaboración de Manuel Jiménez)
 *
 */

public class BubbleSort {
	 
	int[] sortArray;

	public BubbleSort(int[] unsort){
		sortArray = unsort;
		bubbleSort(sortArray);
	}
	
	public int[] getSortArray() {
		return sortArray;
	}

	/**
	 * 
	 * @param arr lista con los datos a ordenar
	 */
	public void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }
	}
}
