package order;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Gerardo Padilla (Colaboración de Manuel Jiménez)
 * 
 */

public class RadixSort {
	
	int[] radixSort;

	public RadixSort(int[] arra){
		radixSort = arra;
		radixsort(radixSort);
	}
	
	public int[] getRadixSort() {
		return radixSort;
	}


	/** Radix Sort function **/
	 public void radixsort(int[] input) {
		  final int RADIX = 10;
		  // Declara e inicializa la lista en que vamos guardando los datos
		  @SuppressWarnings("unchecked")
		List<Integer>[] bucket = new ArrayList[RADIX];
		  for (int i = 0; i < bucket.length; i++) {
		    bucket[i] = new ArrayList<Integer>();
		  }
		 
		  // Ordena
		  boolean maxLength = false;
		  int tmp = -1, placement = 1;
		  while (!maxLength) {
		    maxLength = true;
		    // split input between lists
		    for (Integer i : input) {
		      tmp = i / placement;
		      bucket[tmp % RADIX].add(i);
		      if (maxLength && tmp > 0) {
		        maxLength = false;
		      }
		    }
		    // vacía las listas en el input array
		    int a = 0;
		    for (int b = 0; b < RADIX; b++) {
		      for (Integer i : bucket[b]) {
		        input[a++] = i;
		      }
		      bucket[b].clear();
		    }
		    //pasa al siguiente dígito (posición)
		    placement *= RADIX;
		  }
		} 
}
