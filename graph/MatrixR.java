import java.util.*;
//adjacency matrix representation of graph
public class MatrixR{
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int vertex , edges;
    System.out.println("Enter number of vetex");
    //taking number of edges and vertex as input 
    vertex = sc.nextInt();

     System.out.println("Enter number of edges");
    edges = sc.nextInt();

    //create adjacency matrix
    int AdjMat[][] = new int[vertex][vertex];

 System.out.println("Enter the edges starting and end ");
    //taking edges as input 
    for(int i=0; i<edges ; i++){
        System.out.println("enter u");
        int u = sc.nextInt();
        System.out.println("enter v");
        int v = sc.nextInt();
System.out.println("enter wt");
int wt = sc.nextInt();
        AdjMat[u][v] = wt;
        AdjMat[v][u] = wt; // undirected graph ke liye 
    }


    System.out.println("final output ");
    //printing the adjacency matrix 
    for(int i=0; i<vertex ; i++){
        for(int j=0 ; j<vertex;  j++){
            System.out.print(AdjMat[i][j] + " ");

        }
        System.out.println();
    }

 }    
}