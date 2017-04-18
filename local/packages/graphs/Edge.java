package local.packages.graphs;
import java.util.*;

public class Edge {
    Vertex u, v;
    int cost;
    int distance;
    int capacity;
    int flow;

    Edge(Vertex u, Vertex v, int cost, int capacity) {
        this.u = u;
        this.v = v;
        this.cost = cost;
        this.capacity = capacity;
    }
}
