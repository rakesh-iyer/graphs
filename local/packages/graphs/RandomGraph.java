package local.packages.graphs;
import java.util.*;

public class RandomGraph {
    static Random r = new Random();

    static Graph createRandomGraph(int num) {
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
        }

        // add random edges.
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num/2; j++) {
                Edge e = new Edge(vArray[i], vArray[r.nextInt(num-1)], r.nextInt(maxCost), r.nextInt(maxCapacity));
                g.addEdge(e);
            }
        }

        return g;
    }
}
