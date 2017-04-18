package local.packages.graphs;
import java.util.*;

public class Vertex {
    List<Edge> adjList;
    Boolean visited;

    Vertex() {
        adjList = new ArrayList<>();
    }

    void addEdge(Edge e) {
        adjList.add(e);
    }
}


