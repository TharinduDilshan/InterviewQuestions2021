import java.util.*;

/**
 * A standard DFS implementation puts each vertex of the graph into one of two categories:
 * 1. Visited
 * 2. Not Visited
 *
 * Time Complexity = O(V + E)
 * Space complexity = O(V)
 * where V is the number of nodes and E is the number of edges.
 *
 * The DFS algorithm works as follows:
 * 1. Start by putting any one of the graph's vertices on top of a stack.
 * 2. Take the top item of the stack and add it to the visited list.
 * 3. Create a list of that vertex's adjacent nodes. Add the ones which aren't in the visited list to the top of the stack.
 * 4. Keep repeating steps 2 and 3 until the stack is empty.
 *
 * Application of DFS Algorithm
 * 1. For finding the path
 * 2. To test if the graph is bipartite
 * 3. For finding the strongly connected components of a graph
 * 4. For detecting cycles in a graph
 */
public class DFS {
    private LinkedList<Integer> adjLists[];
    private boolean visited[];

    // Graph creation
    DFS(int vertices) {
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    // Add edges
    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    // DFS algorithm
    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> ite = adjLists[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj])
                DFS(adj);
        }
    }

    //Java main method
    public static void main(String args[]) {
        DFS g = new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        System.out.println("Following is Depth First Traversal");

        g.DFS(2);
    }
}