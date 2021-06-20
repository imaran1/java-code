package sorting_Algo;

public class Graph_Test 
{
	public static void main(String[] args) 
	{
        Graph g = new Graph(5);
        
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.printGraph();
        System.out.println("Following is Breadth First Traversal "+"(starting from vertex 2)");
        g.BFS(2);
        System.out.println("Following is Depth First Traversal "+"(starting from vertex 2)");
        g.DFS(2);
	}
}  
