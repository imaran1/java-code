package sorting_Algo;

import java.util.*;
public class Graph 
{
	int v;
	List<List<Integer>> arr;
	
	Graph(int V)
	{
		this.v=V;
		arr=new ArrayList(v);
		for(int i=0; i<v; i++)
			arr.add(new ArrayList<>());
	}
	
	public void addEdge(int s, int d)
	{
		arr.get(s).add(d);
	}
	public void printGraph()
	{
		for(int i=0; i<v; i++)
		{
			System.out.println("Adjacency list of vertex: " + i);
            for (int j = 0; j <arr.get(i).size();  j++) System.out.print(" -> "+arr.get(i).get(j));
            System.out.println(); 
		}
	}
	
	// Breadth First Search or BFS 
	public void BFS(int  s)
	{
		boolean visited[]=new boolean[v];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);
		while(queue.size()!=0)
		{
			s=queue.poll();
			System.out.print(s+" ");
			Iterator<Integer> it = arr.get(s).iterator();
			while(it.hasNext())
			{
				int n = it.next();
				if(!visited[n])
				{
					visited[n]=true;
					queue.add(n);
				}
			}
		}
		System.out.println();
	}
	
	// Depth First Search or DFS 
	public void DFS(int s)
	{
		boolean visited[] = new boolean[v];
		DFSUtil(s, visited);
	}
	
	private void DFSUtil(int s, boolean visited[])
	{
		visited[s]=true;
		System.out.print(s+" ");
		Iterator<Integer> it = arr.get(s).iterator();
		while(it.hasNext())
		{
			int n = it.next();
			if(!visited[n]) DFSUtil(n, visited);
		}
	}
}
