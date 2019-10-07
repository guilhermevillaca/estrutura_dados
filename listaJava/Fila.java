public class Fila {

	int count = 0;
	static final SIZE = 10;
	int vet[SIZE] = new int[SIZE];
	public void insert(int in){
		if (count < SIZE){
			count++;
			vet[in]=data;
			in = (in+1)%SIZE;
		}
	}

}