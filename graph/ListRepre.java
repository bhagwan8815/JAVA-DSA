import java.util.*;

public class ListRepre {

   static class Edge{
        int dest;
        int wt;

        public Edge(int dest , int wt){
            this.dest = dest;
            this.wt = wt;
        }

    }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int vertex , edges ; 
        System.out.println("enter number of vetices");
        vertex = sc.nextInt();
        System.out.println("enter number of edges");
        edges = sc.nextInt();

        ArrayList<Edge>graph[] = new ArrayList[vertex];

        for(int i=0; i<vertex; i++){
            graph[i] = new ArrayList<>();
        }

        //taking edges as input 
        System.out.println("enter edges src , dest , and wt ");
        for(int i=0; i<edges; i++){
            System.out.println("enter u");
            int u=sc.nextInt();
            System.out.println("enter v");
            int v= sc.nextInt();
            System.out.println("enter wt");
            int wt =sc.nextInt();

            graph[u].add(new Edge(v, wt));
            graph[v].add(new Edge(u, wt)); // for undirected graph
        }

        //printing the adjacency list 
        System.out.println("printing the adjacency list :");
        for(int i=0 ; i<vertex ; i++){
            System.out.print(i + " -->");
            for(Edge e : graph[i]){
                System.out.print("(" + e.dest + "," + e.wt + ")");
            }
            System.out.println();
        }




    }
}
