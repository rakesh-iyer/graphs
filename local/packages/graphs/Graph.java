package local.packages.graphs;
import java.util.*;

public class Graph {
    Set<Vertex> vertexSet;
    Map<Vertex, Edge> edgeMap;

    void Graph() {
        vertexSet = new HashSet<>();
        edgeMap = new HashMap<>();
    }

    void addVertex(Vertex v) {
        vertexSet.add(v);
    }

    void addEdge(Edge e) {
        edgeMap.put(e.u, e);
        e.u.addEdge(e);
    }
}
