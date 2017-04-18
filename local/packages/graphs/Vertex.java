package local.packages.graphs;
import java.util.*;

public class Vertex {
    List<Edge> adjList;
    Boolean visited;
    String name;
    static Integer id = new Integer(0);

    Vertex() {
        adjList = new ArrayList<>();
        name = id.toString();
        id++;
    }

    public String getName() {
        return name;
    }

    void addEdgeList(List<Edge> e) {
        adjList = e;
    }

    public List<Edge> getEdgeList() {
        return adjList;
    }
}


