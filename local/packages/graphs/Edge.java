package local.packages.graphs;
import java.util.*;

public class Edge {
    Vertex u, v;
    int cost;
    int capacity;
    int flow;

    Edge(Vertex u, Vertex v, int cost, int capacity) {
        this.u = u;
        this.v = v;
        this.cost = cost;
        this.capacity = capacity;
    }

    public Vertex getV() {
        return v;
    }

    public Vertex getU() {
        return u;
    }

    public int getCost() {
        return cost;
    }
}
