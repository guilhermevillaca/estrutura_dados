import java.util.Random;
public class ShellSort {

	static int tamV = 100;
	static int[] v = new int[tamV];
	static int[] vInverso = new int[tamV];
	static int[] vRandom = new int[tamV];
	static int contIn = 0;
	static int contEx = 0;	

	public static void insert_sort(int[] arr, int n, int incr){
		for (int i = incr; i < n; i+=incr){
			contEx++;
			for(int j=i; (j > incr) && (arr[j] < arr[j-incr]); j-=incr){
				swap(arr, j, j-incr);
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

	public static void shell_sort(int[] arr, int n){

		for(int i = n/2; i > 2; i/=2){
			for(int j = 0; j < i; j++){
				insert_sort(arr, n-j, i);
			}
		}
		insert_sort(arr, n, 1);

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

		shell_sort(v, tamV);
		printCont("ORD");
		shell_sort(vInverso, tamV);
		printCont("INV");
		shell_sort(vRandom, tamV);
		printCont("RND");

	}


}