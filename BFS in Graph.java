import java.util.*;
class Graph
{
    int v;
    LinkedList<Integer> a[];
 
    Graph(int v)
    {
      
        this.v=v;
        a=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            a[i]=new LinkedList<>();
        }
       
    }
    void addEdge(int source,int destination)
    {
        a[source].add(destination);
        a[destination].add(source);
    }
    void printGraph()
    {      
        for(int i = 0; i < v; i++)
        {
            System.out.println("Adjacency list of vertex "+ i);
            System.out.print("head");
            for(Integer j: a[i]){
                System.out.print(" -> "+j);
            }
            System.out.println("\n");
        }
    }
    void BFS(int src,int dest)
    {
        int s;
        Queue<Integer> queue=new LinkedList<>();
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];
        int parent[] = new int[v];
        visited[src]=true;
        queue.add(src);
        while(!queue.isEmpty())
        {
            s = queue.poll();
            
            System.out.print(s+" ");
            /*Iterator<Integer> i = a[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }*/
            for(int i:a[s])
            {
                int n = i;
                if (!visited[n])
                {
                    distance[i]=distance[s]+1;
                    parent[i]=s;
                    visited[n] = true;
                    queue.add(n);
                }
            }
            
        }
        //Shortest Path in Graph using BFS for unweighted graph
        //Assuming it takes 1 second to traverse adjacent nodes
        //In BFS whenever we visit node first time that will give us shortest path of that node from starting node 
        System.out.println("Mininum Distance Required to reach:");
        System.out.println(Arrays.toString(distance));
        System.out.println("Parent Node");
        System.out.println(Arrays.toString(parent));
        //Shortest Path
        System.out.println("Shortest Path");
        int temp=dest;
        while(temp!=src)
        {
            System.out.print(temp+"<--");
            temp=parent[temp];
        }
        System.out.print(src);
    }
   
}

class demo{
   
    public static void main(String args[])
    {
        // create the graph given in above figure
        int V = 5;
        Graph graph = new Graph(V);
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        System.out.println("Graph Traversal using BFS");
        graph.BFS(0,2);
        // print the adjacency list representation of
        // the above graph
        //graph.printGraph();
    }
}