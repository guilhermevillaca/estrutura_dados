public class Grafo {

	static class Node {   
        int key; 
        Node next; 
        Node pi;
        String color;
        int distance;
        int f;
        // Constructor 
        Node(int d) { 
            key = d; 
            next = null;
            pi = null;
            color = "WHITE";
            distance = 0;
            f = 0;
        } 

        Node (){ 
        } 
    } 
    static int tempo=0;
	public static void dfs(Node[] graph, int size){
		for (int i=0; i < size; i++ ){
			graph[i].color= "WHITE";
		 	graph[i].pi= null;
		 	graph[i].distance=0;
	 	}
	 	
	 	int in=0; 
	 	int out=0;
	 	int n_queue=0;
	 	for (int i=0; i < size; i++ ){
			if (graph[i].color.equals("WHITE")){
		 		visit_dfs(graph, size, i);
		 	}
	 	}
	}

	public static void visit_dfs(Node[] graph, int size, int u){
		int t;
		tempo++;
		graph[u].distance=tempo;
		graph[u].color= "GRAY";
		for (int v=0; v < size; v++){
			if ((v!=u) && (isAdjacent(graph, u,v)) && (graph[v].color=="WHITE")){
	 			graph[v].pi=graph[u];
	 			visit_dfs(graph, size,v);
	 		}
	 	}
	 	graph[u].color="BLACK";
	 	tempo++;
	 	graph[u].f= tempo;
	}

	public static void insert_node(Node[] graph, int node_number, Node t){
		 Node temp;
		 temp= graph[node_number].next;
		 if (temp==null) {
		 	graph[node_number].next=t;
		 	t.next=null;
		 } else{
		 	while (temp.next != null){
		 		temp = temp.next;		 		
		 	}
		 	temp.next = t;
		 	t.next=null;
		 }
	}

	public static boolean isAdjacent(Node[] graph, int i, int j){
		return true;
	}

	public static void insertVertice(Node[] graph, int u, int v){

	}


	public static void main(String[] args) {
		/*Node[] graph = new Node[6];
		//grafo de 6 vertices
		//graph= malloc(sizeof(struct node)*6);
		for (int i=0; i < 6; i++){
			graph[i].key= i;
			graph[i].next= null;
		}
		//aresta do vertice 3 para o 2
		Node t = new Node();
		//t= malloc(sizeof(struct node));
		t.key= 2;
		insert_node(graph, 3,t);*/


		Node[][] graph = new Node[6][6];
 		for (int i=0; i < 6; i++){
			for (int j=0; j < 6; j++){
				graph[i][j].key=0;
			}
 		}
 		//inserindo aresta 3 para 2
 		graph[3][2].key= 1;

		
	}

}