import java.util.Random;

public class InsertSort {

	static int tamV = 1000;
	static int[] v = new int[tamV];
	static int[] vInverso = new int[tamV];
	static int[] vRandom = new int[tamV];
	static int contIn = 0;
	static int contEx = 0;	

	public static void insert_sort(int[] arr, int n){
		for (int i =0; i < n; i++){
			contEx++;
			for(int j=i; (j > 0) && (arr[j] < arr[j-1]); j--){
				swap(arr, j, j-1);
				contIn++;	
			}
		}
	}

	public static void swap(int[] arr, int j, int j1){
		int temp = arr[j];
		arr[j] = arr[j1];
		arr[j1] = temp;
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

		insert_sort(v, tamV);
		printCont("ORD");
		insert_sort(vInverso, tamV);
		printCont("INV");
		insert_sort(vRandom, tamV);
		printCont("RND");
		//imprime(v, tamV);
		//imprime(vInverso, tamV);
		//imprime(vRandom, tamV);
		
	}


}