class ArvoreRBRotate{


	public static void main(String[] args) {
		
	}

	public static void leftRotate(){
		y = x.direita;
		x.direita = y.esquerda;
		if (y.esquerda != T.nil){
			y.esquerda.p = x;
		}
		y.p = x.p;
		if(x.p == T.nil){
			T.raiz = y;
		}else if(x == x.p.esquerda){
			x.p.esquerda = y;
		}else {
			x.p.direita = y;
		}
		y.esquerda = x;
		x.p = y;
	}

	public static void rightRotate(){
		x = y.esquerda;
		y.esquerda = x.direita;
		if(x.direita != T.nil){
			x.direita.p = y;
		}
		x.p = y.p;
		if(y.p == T.nil){
			T.raiz = x;
		}else if(y == y.p.direita){
			y.p.direita = x;
		}else {
			y.p.esquerda = x;
		}
		x.direita = y;
		y.p = x;
	}
}