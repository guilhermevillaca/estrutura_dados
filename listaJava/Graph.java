// Adjacency list representation in Java
// Author: Algorithm Tutor

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class Graph {
    private HashMap graph;

    public Graph() {
        graph = new HashMap<>();
    }

    public void addEdge(int u, int v, int weight, boolean isDirected) {
        if(graph.containsKey(u)) {
            HashMap edge_map = graph.get(u);
            edge_map.put(v, weight);
        } else {
            HashMap edge_map = new HashMap<>();
            edge_map.put(v, weight);
            graph.put(u, edge_map);
        }

        if (isDirected == false) {
            if(graph.containsKey(v)) {
            HashMap edge_map = graph.get(v);
            edge_map.put(u, weight);
            } else {
                HashMap edge_map = new HashMap<>();
                edge_map.put(u, weight);
                graph.put(v, edge_map);
            }
        }
    }

    @Override
    public String toString() {
        String to_return = "";
        Iterator it = graph.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry)it.next();
            System.out.print(me.getKey() + ": ");
            HashMap value = (HashMap)me.getValue();
            Iterator it1 = value.entrySet().iterator();
            while (it1.hasNext()) {
                Map.Entry me1 = (Map.Entry) it1.next();
                System.out.print("(" + me1.getKey() + "," + me1.getValue() + ")");
                System.out.print("   ");
            }
            System.out.println();
        }
        return to_return;
    }

    public static void main(String [] args) {
        Graph g = new Graph();
        g.addEdge(1, 2, 7, false);
        g.addEdge(1, 3, 2, false);
        g.addEdge(2, 3, 1, false);
        g.addEdge(2, 4, 5, false);
        g.addEdge(2, 5, 3, false);
        g.addEdge(3, 5, 11, false);
        g.addEdge(4, 5, 10, false);
        g.addEdge(4, 6, 7, false);
        g.addEdge(5, 6, 4, false);
        System.out.println(g);
    }
}