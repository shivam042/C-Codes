import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
class Graph
{
    int v;
    LinkedList<Integer> a[];
    //=new LinkedList[5];
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
    void BFS(int src)
    {
        int s;
        Queue<Integer> queue=new LinkedList<>();
        boolean visited[] = new boolean[v];
        
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
                    visited[n] = true;
                    queue.add(n);
                }
            }
            
        }
        System.out.println(Arrays.toString(visited));
    }
   
}
class demo{
   
    public static void main(String args[])
    {
        // create the graph given in above figure
        int V = 5;
        Graph graph = new Graph(V);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.BFS(1);
        // print the adjacency list representation of
        // the above graph
        //graph.printGraph();
    }
}