import java.util.Random;
public class SelectSort {

	static int tamV = 1000;
	static int[] v = new int[tamV];
	static int[] vInverso = new int[tamV];
	static int[] vRandom = new int[tamV];
	static int contIn = 0;
	static int contEx = 0;	

	public static void select_sort(int[] arr, int n){

		for (int i = 0; i < (n-1); i++){
			int lowindex = i;
			contEx++;
			for(int j = n-1; j > i; j--){
				if(arr[j] < arr[lowindex]){
					lowindex = j;
				}
				contIn++;
			}
			swap(arr, lowindex, i);
		}

	} 

	public static void swap(int[] arr, int lowindex, int i){
		int temp = arr[lowindex];
		arr[lowindex] = arr[i];
		arr[i] = temp;
	}

	public static void imprime(int[] arr, int n){
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + ", ");
		}
		System.out.println(" ---- ");
	}

	public static void printCont(String ordem){
		
		System.out.println("Contagem externa " + ordem + ": " + contEx);
		System.out.println("Contagem interna " + ordem + ": " + contIn);
		contIn = 0;
		contEx = 0;
	}


	public static void main(String[] args){

		for(int i = 0; i < tamV; i++){
			v[i] = i;
		}

		for(int i = 0; i < tamV; i++){
			vInverso[i] = tamV - i;
		}

		Random random = new Random();
		for(int i = 0; i <tamV; i++){
			vRandom[i] = random.nextInt(tamV);
		}

		select_sort(v, tamV);
		printCont("ORD");
		select_sort(vInverso, tamV);
		printCont("INV");
		select_sort(vRandom, tamV);
		printCont("RND");
		//imprime(v, tamV);
		//imprime(vInverso, tamV);
		//imprime(vRandom, tamV);

	}


}