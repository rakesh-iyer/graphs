package local.packages.graphs;
import java.util.*;

public class RandomGraph {
    static Random r = new Random();

    public static Graph createRandomGraph(int num) {
        Graph g = new Graph();

        if (num < 2) {
            return null;
        }

        Vertex[] vArray = new Vertex[num];
        int maxCost = 1000;
        int maxCapacity = 1000;

        // create num vertices.
        for (int i = 0; i < num; i++) {
            vArray[i] = new Vertex();
            g.addVertex(vArray[i]);
        }

        // add random edges.
        for (int i = 0; i < num; i++) {
            Map<Integer, Integer> map = new HashMap<>();

            while (map.size() < num/2) {
                int next = r.nextInt(num-1);
                if (i != next) { 
                    map.put(next, next);
                }
            }

            for (Integer next : map.keySet()) {
                Edge e = new Edge(vArray[i], vArray[next], r.nextInt(maxCost), r.nextInt(maxCapacity));
                g.addEdge(e);
            }
        }

        return g;
    }
}
