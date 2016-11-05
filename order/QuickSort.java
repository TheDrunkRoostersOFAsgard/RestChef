package order;

/**
 * 
 * @author Gerardo Padilla (Colaboraci�n de Manuel Jim�nez)
 *
 */

public class QuickSort {
	
	private int array[];
	private int length;
	
	public QuickSort(int[] inputArr){
		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	/**
	 * 
	 * @param lowerIndex menor elemento de la lista
	 * @param higherIndex mayor elemento de la lista
	 */
	private void quickSort(int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;
		// calcula el pivota, toma el n�mero de en medio
		int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
		// Divisi�n en dos arrays
		while (i <= j) {

			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				//mueve el �ndice a la siguiente posici�n en ambos lados
				i++;
				j--;
			}
		}
		// llamada recursiva
		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);
	}

	/**
	 * 
	 * @param i elemento en X
	 * @param j elemento en y
	 */
	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	/**
	 * 
	 * @return lista ordenada
	 */
	public int[] getArray() {
		return array;
	}
}
