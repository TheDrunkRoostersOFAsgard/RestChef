package order;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase sirve para el manejo de las listas de ingredientes
 * 
 * @author Gerardo Padilla
 *
 */

public class ingredientLists {
	
	
	ArrayList<String[]> Frutas = new ArrayList<String[]>();
	ArrayList<String[]> Granos = new ArrayList<String[]>();
	ArrayList<String[]> Vegetales = new ArrayList<String[]>();
	ArrayList<String[]> L�cteos = new ArrayList<String[]>();
	ArrayList<String[]> Carnes = new ArrayList<String[]>();
	List<Integer> FrutasIDO = new ArrayList<>();
	List<Integer> GranosIDO = new ArrayList<>(); 
	List<Integer> VegetalesIDO = new ArrayList<>();
	List<Integer> L�cteosIDO = new ArrayList<>();
	List<Integer> CarnesIDO = new ArrayList<>();
	
	/**
	 * 
	 * @param Fruta recibe el array del nuevo ingrediente, lo a�ade a la lista, la ordena en un temporal y convierte el temporal en el oficial
	 */
	
	public void AddToFrutas(String[] Fruta) {
		Frutas.add(Fruta);
		FrutasIDO.add(Integer.parseInt(Fruta[0]));
		int[] FrutasIDOArray = GetIDOArrayF();
		FrutasIDOArray = new QuickSort(FrutasIDOArray).getArray();
		ArrayList<String[]> FrutasTemp = new ArrayList<String[]>();
		List<Integer> FrutasIDOTemp = new ArrayList<>();
		for (int i = 0; i < FrutasIDOArray.length; i++) {
			for (int j = 0; j < Frutas.size(); j++) {
				if (Integer.parseInt(Frutas.get(j)[0])==FrutasIDOArray[i]){
					FrutasTemp.add(Frutas.get(j));
				}
			}
			FrutasIDOTemp.add(FrutasIDOArray[i]);
		}
		Frutas=FrutasTemp;
		FrutasIDO=FrutasIDOTemp;
	}
	
	/**
	 * 
	 * @param Grano recibe el array del nuevo ingrediente, lo a�ade a la lista, la ordena en un temporal y convierte el temporal en el oficial
	 */
	
	public void AddToGranos(String[] Grano) {
		Granos.add(Grano);
		GranosIDO.add(Integer.parseInt(Grano[0]));
		int[] GranosIDOArray = GetIDOArrayG();
		GranosIDOArray = new RadixSort(GranosIDOArray).getRadixSort();
		ArrayList<String[]> GranosTemp = new ArrayList<String[]>();
		List<Integer> GranosIDOTemp = new ArrayList<>();
		for (int i = 0; i < GranosIDOArray.length; i++) {
			for (int j = 0; j < Granos.size(); j++) {
				if (Integer.parseInt(Granos.get(j)[0])==GranosIDOArray[i]){
					GranosTemp.add(Granos.get(j));
				}
			}
			GranosIDOTemp.add(GranosIDOArray[i]);
		}
		Granos=GranosTemp;
		GranosIDO=GranosIDOTemp;
	}
	
	/**
	 * 
	 * @param Vegetal recibe el array del nuevo ingrediente, lo a�ade a la lista, la ordena en un temporal y convierte el temporal en el oficial
	 */
	
	public void AddToVegetales(String[] Vegetal) {
		Vegetales.add(Vegetal);
		VegetalesIDO.add(Integer.parseInt(Vegetal[0]));
		int[] VegetalesIDOArray = GetIDOArrayV();
		VegetalesIDOArray = new ShellSort(VegetalesIDOArray).getShellSort();
		ArrayList<String[]> VegetalesTemp = new ArrayList<String[]>();
		List<Integer> VegetalesIDOTemp = new ArrayList<>();
		for (int i = 0; i < VegetalesIDOArray.length; i++) {
			for (int j = 0; j < Vegetales.size(); j++) {
				if (Integer.parseInt(Vegetales.get(j)[0])==VegetalesIDOArray[i]){
					VegetalesTemp.add(Vegetales.get(j));
				}
			}
			VegetalesIDOTemp.add(VegetalesIDOArray[i]);
		}
		Vegetales=VegetalesTemp;
		VegetalesIDO=VegetalesIDOTemp;
	}
	
	/**
	 * 
	 * @param L�cteo recibe el array del nuevo ingrediente, lo a�ade a la lista, la ordena en un temporal y convierte el temporal en el oficial
	 */
	
	public void AddToL�cteos(String[] L�cteo) {
		L�cteos.add(L�cteo);
		L�cteosIDO.add(Integer.parseInt(L�cteo[0]));
		int[] L�cteosIDOArray = GetIDOArrayL();
		L�cteosIDOArray = new BubbleSort(L�cteosIDOArray).getSortArray();
		ArrayList<String[]> L�cteosTemp = new ArrayList<String[]>();
		List<Integer> L�cteosIDOTemp = new ArrayList<>();
		for (int i = 0; i < L�cteosIDOArray.length; i++) {
			for (int j = 0; j < L�cteos.size(); j++) {
				if (Integer.parseInt(L�cteos.get(j)[0])==L�cteosIDOArray[i]){
					L�cteosTemp.add(L�cteos.get(j));
				}
			}
			L�cteosIDOTemp.add(L�cteosIDOArray[i]);
		}
		L�cteos=L�cteosTemp;
		L�cteosIDO=L�cteosIDOTemp;
	}
	
	/**
	 * 
	 * @param Carne recibe el array del nuevo ingrediente, lo a�ade a la lista, la ordena en un temporal y convierte el temporal en el oficial
	 */
	
	public void AddToCarnes(String[] Carne) {
		Carnes.add(Carne);
		CarnesIDO.add(Integer.parseInt(Carne[0]));
		int[] CarnesIDOArray = GetIDOArrayC();
		CarnesIDOArray = new InsertionSort(CarnesIDOArray).getInsertionArray();
		ArrayList<String[]> CarnesTemp = new ArrayList<String[]>();
		List<Integer> CarnesIDOTemp = new ArrayList<>();
		for (int i = 0; i < CarnesIDOArray.length; i++) {
			for (int j = 0; j < Carnes.size(); j++) {
				if (Integer.parseInt(Carnes.get(j)[0])==CarnesIDOArray[i]){
					CarnesTemp.add(Carnes.get(j));
				}
			}
			CarnesIDOTemp.add(CarnesIDOArray[i]);
		}
		Carnes=CarnesTemp;
		CarnesIDO=CarnesIDOTemp;
	}
		
	//Remover un ingrediente de la lista


	public void RemoveFromF(){
		Frutas.remove(0);		
	}
	public void RemoveFromG(){
		Granos.remove(0);		
	}
	public void RemoveFromV(){
		Vegetales.remove(0);		
	}
	public void RemoveFromL(){
		L�cteos.remove(0);		
	}
	public void RemoveFromC(){
		Carnes.remove(0);		
	}

	/**
	 * 
	 * @param Index
	 * @return Array del ingrediente de la lista de ingredientes buscado
	 */
	
	public String[] PeekFromF(int Index){
		return Frutas.get(Index);
	}
	public String[] PeekFromG(int Index){
		return Granos.get(Index);
	}
	public String[] PeekFromV(int Index){
		return Vegetales.get(Index);
	}
	public String[] PeekFromL(int Index){
		return L�cteos.get(Index);
	}
	public String[] PeekFromC(int Index){
		return Carnes.get(Index);
	}

	/**
	 * 
	 * @return Array con los arrays de los ingredientes para f�cil manipulaci�n
	 */

	public String[][] GetFrutasList(){
		String[][] FrutasList = new String[Frutas.size()][];
		for (int i = 0; i < Frutas.size(); i++) {
			FrutasList[i]=Frutas.get(i);
		}
		return FrutasList;
	}
	public String[][] GetGranosList(){
		String[][] GranosList = new String[Granos.size()][];
		for (int i = 0; i < Granos.size(); i++) {
			GranosList[i]=Granos.get(i);
		}
		return GranosList;
	}
	public String[][] GetVegetalesList(){
		String[][] VegetalesList = new String[Vegetales.size()][];
		for (int i = 0; i < Vegetales.size(); i++) {
			VegetalesList[i]=Vegetales.get(i);
		}
		return VegetalesList;
	}
	public String[][] GetL�cteosList(){
		String[][] L�cteosList = new String[L�cteos.size()][];
		for (int i = 0; i < L�cteos.size(); i++) {
			L�cteosList[i]=L�cteos.get(i);
		}
		return L�cteosList;
	}
	public String[][] GetCarnesList(){
		String[][] CarnesList = new String[Carnes.size()][];
		for (int i = 0; i < Carnes.size(); i++) {
			CarnesList[i]=Carnes.get(i);
		}
		return CarnesList;
	}
	
	/**
	 * 
	 * @return Array de int de los IDs para f�cil ordenamiento
	 */
	
	public int[] GetIDOArrayF(){
		int[] IDOArray = new int[FrutasIDO.size()];
		for (int i = 0; i < FrutasIDO.size(); i++) {
			IDOArray[i]=FrutasIDO.get(i);
		}
		return IDOArray;
	}
	public int[] GetIDOArrayG(){
		int[] IDOArray = new int[GranosIDO.size()];
		for (int i = 0; i < GranosIDO.size(); i++) {
			IDOArray[i]=GranosIDO.get(i);
		}
		return IDOArray;
	}
	public int[] GetIDOArrayV(){
		int[] IDOArray = new int[VegetalesIDO.size()];
		for (int i = 0; i < VegetalesIDO.size(); i++) {
			IDOArray[i]=VegetalesIDO.get(i);
		}
		return IDOArray;
	}
	public int[] GetIDOArrayL(){
		int[] IDOArray = new int[L�cteosIDO.size()];
		for (int i = 0; i < L�cteosIDO.size(); i++) {
			IDOArray[i]=L�cteosIDO.get(i);
		}
		return IDOArray;
	}
	public int[] GetIDOArrayC(){
		int[] IDOArray = new int[CarnesIDO.size()];
		for (int i = 0; i < CarnesIDO.size(); i++) {
			IDOArray[i]=CarnesIDO.get(i);
		}
		return IDOArray;
	}
}
