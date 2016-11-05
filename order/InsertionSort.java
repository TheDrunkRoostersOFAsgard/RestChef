package order;

/**
 * 
 * @author Gerardo Padilla (Colaboración de Manuel Jiménez)
 *
 */

public class InsertionSort {
	
	int[] InsertionArray;
	/**
	 * 
	 * @param Arra klista que sera tomada en cuenta para ordenar
	 */
	public InsertionSort(int[] Arra){
		InsertionArray = Arra;
		InsertionArray = doInsertionSort(InsertionArray);		
	}

	public int[] getInsertionArray() {
		return InsertionArray;
	}

	/**
	 * 
	 * @param input lista con los datos a ordenar
	 * @return input ordenado
	 */
	public int[] doInsertionSort(int[] input){
        
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}
