import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
 
public class Dijkistra extends Graph{
    
    private boolean nodosVisitados[];
    private int distancias[];
    private int father[];
    private List filaDePrioridade = new ArrayList<Integer>();
    private int origem;
     
    /*
     * Construtor : recebe o numero de nodos do grafo
     */
    public Dijkistra(int numeroDeNodos)throws Exception{
        super(numeroDeNodos);
        //como sera considerado de 1- n entao e acrescentado + 1
        nodosVisitados = new boolean[numeroDeNodos];
        //como sera considerado de 1- n entao e acrescentado + 1
        distancias = new int[numeroDeNodos];
        //antecesor do vertice
        father = new int[numeroDeNodos];
    }
     
    private int dijkistra(int origem, int destino)throws Exception{
 
        if(origem < 0 || origem > getNUMERO_DE_NODOS())
            throw new Exception("origem eh menor que 0 ou destino nao existe");
                 
        try{
            iniciaMenorCaminho(origem);
        }catch(Exception ex){
            System.out.println("Erro ao iniciar os dados "+ex);
        }
         
                 
        while(!filaDePrioridade.isEmpty()){             
            Integer verticeMenorPeso = extraiMenor();     
             
             
            for(int i = 0 ; i < getNUMERO_DE_NODOS() ; i++){
                 
                if(getMatrizDePesos()[verticeMenorPeso][i] > 0)                     
                    relaxa(verticeMenorPeso,i);                 
            }
             
        }
        printDistancias();
        return distancias[destino];                          
    }
    /*
     * Inicia dados do algoritmo
     */
    private void iniciaMenorCaminho(int origem){
        for(int i = 0 ; i < getNUMERO_DE_NODOS(); i++){
            distancias[i] = OO;
            nodosVisitados[i] = false;     
            father[i] = OO;
            filaDePrioridade.add(new Integer(i));//adiciona a aresta na fila
        }
        distancias[origem] = 0;//inicia o vetor de distancias
         
    }
     
    /*
     * Relaxa arestas no grafo
     */
    private void relaxa(int u, int v){
         
            if (distancias[v] > distancias[u]+getMatrizDePesos()[u][v]){                 
                distancias[v] = distancias[u]+getMatrizDePesos()[u][v];
                father[v] = u;                         
            }
    }
     
    private int extraiMenor(){
        int menorValor = OO;   
        int verticeDeMenorPeso=0;
         
        Iterator<Integer>it = filaDePrioridade.iterator();
        while(it.hasNext()){
            int verticeAtual = it.next();             
            if(distancias[verticeAtual] < menorValor){                 
                menorValor = distancias[verticeAtual];
                verticeDeMenorPeso = verticeAtual;
            }
        }
         
        System.out.println("Remove o vertice "+verticeDeMenorPeso+" da fila "
                           +" de peso "+menorValor);
        //remove o vertice com menor distancia do grafo
        filaDePrioridade.remove(new Integer(verticeDeMenorPeso));         
        System.out.println("-------------------------------------------------");
         
        return verticeDeMenorPeso;
    }
     
    public int getOrigem() {
        return origem;
    }
 
    public void setOrigem(int origem) {
        this.origem = origem;
    }
     
    public List getFilaDePrioridade() {
        return filaDePrioridade;
    }
 
    public void setFilaDePrioridade(List filaDePrioridade) {
        this.filaDePrioridade = filaDePrioridade;
    }
     
    private void printDistancias(){
        for(int i = 0 ; i < getNUMERO_DE_NODOS(); i++)
            System.out.print("["+distancias[i]+"] ");
        System.out.println();
    }
    public static void main(String args[]){
         
         
        try{
            Dijkistra dij = new Dijkistra(5);
            dij.insertArc(0, 1, 1);            
            dij.insertArc(0, 3, 3);
            dij.insertArc(0, 4, 10);
            dij.insertArc(1, 2, 5);
            dij.insertArc(2, 4, 1);
            dij.insertArc(3, 2, 2);
            dij.insertArc(3, 4, 6);         
            //dij.insertArc(4, 3, 8);
            //dij.insertArc(4, 0, 9);             
            System.out.println("Menor caminho entre 0 e 4 "+dij.dijkistra(0,4 ));             
            //dij.printMatriz(dij.getMatrizDePesos());
        }catch(Exception ex){
            if(ex.getMessage() == null)
                  System.out.println("Ocorreu um erro de "+ex+" no main");
            else 
                System.out.println(ex.getMessage()+"XXX");
        }
         
    }
}