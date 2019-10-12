public class PilhaV<T> {
	
	private T[] arrayPilha;

	private int topo; //tos (top of the stack)

	public PilhaV(int max){
		arrayPilha = (T[]) new Object[max];
		topo = -1;
	}

	public boolean inserir(T elemento)	{
		if(!this.estaCheia()){
			topo++;
			arrayPilha[topo] = elemento;
			return true;
		}
		return false;
	}

	public T remover(){
		if(!this.estaVazia()){
			return arrayPilha[topo--];
		}
		return null;
	}

	public boolean estaVazia(){
		return topo == -1;
	}

	public boolean estaCheia(){
		return topo == arrayPilha.length-1;
	}
	
}