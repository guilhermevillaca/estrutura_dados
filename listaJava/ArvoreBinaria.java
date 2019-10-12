import java.util.Scanner;

public class ArvoreBinaria {
	static Node head;
	static class Node {
		int key;
		Node p;
		Node left;
		Node right;
		Node(int key){
			this.key = key;
			this.p = null;
			this.left = null;
			this.right = null;
		}
		Node(){
			this.p = null;
			this.left = null;
			this.right = null;	
		}
	}

	public static void insert(Node top, Node n){
		Node y = null;
		Node x = top;
		while(x != null){
			y = x;
			if(n.key < x.key){
				x = x.left;
			}else {
				x = x.right;
			}
		}
		n.p = y;
		if(y==null){
			top = n;
		}else if(n.key  < y.key){
			y.left = n;
		}else {
			y.right = n;
		}
	}

	/**
	Z é o node que será removido
	*/
	public static void delete(Node top, Node z){
		Node y;
		if(z.left==null){
			transplant(top, z, z.right);
		}else if(z.right==null){
			transplant(top, z, z.left);
		}else {
			y = tree_minimum(z.right);
			if(y.p != z){
				transplant(top, y, y.right);
				y.right = z.right;
				y.right.p = y;
			}
			transplant(top, z, y);
			y.left = z.left;
			y.left.p = y;
		}
	}

	public static Node tree_minimum(Node x){
		while(x.left !=null){
			x = x.left;
		}
		return x;
	}

	public static Node tree_maximum(Node x){
		while(x.right !=null){
			x = x.right;
		}
		return x;
	}

	public static void transplant(Node top, Node u, Node v){
		if(u.p == null){
			top = v;
		}else if(u==u.p.left){
			u.p.left = v;
		}else {
			u.p.right = v;
		}

		if(v != null){
			v.p = u.p;
		}
	}

	public static void inTree(Node top){
		if(top!=null){
			inTree(top.left);			
			System.out.println(top.key + ", ");
			inTree(top.right);
		}
	}

	public static void preTree(Node top){
		if(top!=null){
			System.out.print(top.key + ", ");
			preTree(top.left);
			preTree(top.right);
		}
	}

	public static void posTree(Node top){
		if(top!=null){
			posTree(top.left);
			posTree(top.right);
			System.out.print(top.key + ", ");
		}
	}

	public static void main(String[] args) {
		head = new Node(3);
		/*for(int i = 0; i < 6; i++){
			Scanner keyboard = new Scanner(System.in);
			System.out.println("enter a int");
			int myint = keyboard.nextInt();
			Node novo = new Node(myint);
			insert(head, novo);
		}*/
		Node novo1 = new Node(12);
		insert(head,novo1);
		Node novo2 = new Node(5);
		insert(head,novo2);
		Node novo3 = new Node(2);
		insert(head,novo3);
		Node novo4 = new Node(9);
		insert(head,novo4);
		Node novo5 = new Node(18);
		insert(head,novo5);
		Node novo6 = new Node(15);
		insert(head,novo6);
		Node novo7 = new Node(19);
		insert(head,novo7);
		Node novo8 = new Node(17);
		insert(head,novo8);
		Node novo9 = new Node(13);
		insert(head,novo9);

		System.out.println("-----------------");
		inTree(head);
		System.out.println(" ");
		//preTree(head);
		System.out.println("");
		Node min = tree_minimum(head);
		Node max = tree_maximum(head);
		System.out.println(max.key + " [[[[[[[[[[[[");
		delete(head, max);
		inTree(head);
		//posTree(head);
		//System.out.println(novo.key);

	}
}