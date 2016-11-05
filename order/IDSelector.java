package order;

public class IDSelector {
	
	/**
	 * Esta Clase asigna un número o ID basado en las primeras letras para el ordenamiento
	 * 
	 * @author Gerardo Padilla
	 */
	
	public String[] IDSelect(String[] Ingredient) {
		
		/**
		 * 
		 * @param Ingredient String Array con el nombre del ingrediente y la cantidad
		 * @return String Array con ID asignado basado en las primeras dos letras, nombre del ingrediente y cantidad
		 */
		
		String ID;
		ID=String.valueOf(10000+LValue(Ingredient[0].substring(0))*100+LValue(Ingredient[0].substring(1)));
		String[] IngredientArray={ID,Ingredient[0],Ingredient[1]};
		return IngredientArray;	
	}
	
	/**
	 * 
	 * @param N elemento a valorar
	 * @return elemento nuevo cambiado
	 */
	private int LValue(String N){
		int V;
		if (N=="A"|N=="a"){
			V=1; 
		}
		if (N=="B"|N=="b"){
			V=2; 
		}
		if (N=="C"|N=="c"){
			V=3; 
		}
		if (N=="D"|N=="d"){
			V=4; 
		}
		if (N=="E"|N=="e"){
			V=5; 
		}
		if (N=="F"|N=="f"){
			V=6; 
		}
		if (N=="G"|N=="g"){
			V=7; 
		}
		if (N=="H"|N=="h"){
			V=8; 
		}
		if (N=="I"|N=="i"){
			V=9; 
		}
		if (N=="J"|N=="j"){
			V=10; 
		}
		if (N=="K"|N=="k"){
			V=11; 
		}
		if (N=="L"|N=="l"){
			V=12; 
		}
		if (N=="M"|N=="m"){
			V=13; 
		}
		if (N=="N"|N=="n"){
			V=14; 
		}
		if (N=="Ñ"|N=="ñ"){
			V=15; 
		}
		if (N=="O"|N=="o"){
			V=16; 
		}
		if (N=="P"|N=="p"){
			V=17; 
		}
		if (N=="Q"|N=="q"){
			V=18; 
		}
		if (N=="R"|N=="r"){
			V=19; 
		}
		if (N=="S"|N=="s"){
			V=20; 
		}
		if (N=="T"|N=="t"){
			V=21; 
		}
		if (N=="U"|N=="u"){
			V=22; 
		}
		if (N=="V"|N=="v"){
			V=23; 
		}
		if (N=="W"|N=="w"){
			V=24; 
		}
		if (N=="X"|N=="x"){
			V=25; 
		}
		if (N=="Y"|N=="y"){
			V=26; 
		}
		if (N=="Z"|N=="z"){
			V=27; 
		}
		else{
			V=0;			
		}
		return V;
	}
}