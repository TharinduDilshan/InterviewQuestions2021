import java.util.*;

/**
 * A standard BFS implementation puts each vertex of the graph into one of two categories:
 * 1. Visited
 * 2. Not Visited
 *
 * Time Complexity = O(V + E)
 * Space complexity = O(V)
 * where V is the number of nodes and E is the number of edges.
 *
 * The algorithm works as follows:
 * 1. Start by putting any one of the graph's vertices at the back of a queue.
 * 2. Take the front item of the queue and add it to the visited list.
 * 3. Create a list of that vertex's adjacent nodes. Add the ones which aren't in the visited list to the back of the queue.
 * 4. Keep repeating steps 2 and 3 until the queue is empty.
 *
 * BFS Algorithm Applications
 * 1. To build index by search index
 * 2. For GPS navigation
 * 3. Path finding algorithms
 * 4. In Ford-Fulkerson algorithm to find maximum flow in a network
 * 5. Cycle detection in an undirected graph
 * 6. In minimum spanning tree
 */
public class BFS {

    private int V;
    private LinkedList<Integer> adj[];

    // Create a graph
    BFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Add edges to the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // BFS algorithm
    void BFS(int s) {

        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    //Java Main Program
    public static void main(String args[]) {
        BFS g = new BFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

        g.BFS(2);
    }
}