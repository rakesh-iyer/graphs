package local.packages.graphs;
import java.util.*;

public class Vertex {
    List<Edge> adjList;
    Boolean visited = false;
    Vertex previous;
    String name;
    static Integer id = new Integer(0);
    int distance;

    Vertex() {
        adjList = new ArrayList<>();
        name = id.toString();
        id++;
    }

    public Boolean isVisited() {
        return visited;
    }

    public void setVisited(Boolean state) {
        visited = state;
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

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Vertex getPrevious() {
        return previous;
    }

    public void setPrevious(Vertex previous) {
        this.previous = previous;
    }
}
