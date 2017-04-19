package local.packages.graphs;
import java.util.*;

public class Graph {
    Set<Vertex> vertexSet;
    Map<Vertex, List<Edge>> edgeMap;

    Graph() {
        vertexSet = new HashSet<>();
        edgeMap = new HashMap<>();
    }

    public Iterator<Vertex> getVertexIterator() {
        return vertexSet.iterator();
    }

    public int getVertexCount() {
        return vertexSet.size();
    }

    void addVertex(Vertex v) {
        vertexSet.add(v);
    }

    void addEdge(Edge e) {
        List<Edge> edgeList = edgeMap.get(e.u);

        if (edgeList == null) {
            edgeList = new ArrayList<>();
            e.u.addEdgeList(edgeList);
            edgeMap.put(e.u, edgeList);
        }
        
        edgeList.add(e);
    }
}
