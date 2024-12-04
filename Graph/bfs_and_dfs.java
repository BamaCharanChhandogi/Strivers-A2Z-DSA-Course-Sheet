import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs_and_dfs {
    public ArrayList<ArrayList<Integer>> list;
    private int numVertex;
    public bfs_and_dfs(int numVertex){
        this.numVertex=numVertex;
        list=new ArrayList<ArrayList<Integer>>(numVertex);
        for(int i=0;i<numVertex;i++){
            list.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int src,int des){
        list.get(src).add(des);
        // list.get(des).add(src);
    }
    public void bfs_graph(int startVertex,ArrayList<ArrayList<Integer>> list){
        Queue<Integer> qu=new LinkedList<>();
        boolean visited[] =new boolean[numVertex];
        qu.add(startVertex);
        visited[startVertex]=true;
        while(!qu.isEmpty()){
            int node=qu.poll();
            System.out.print(node+" ");
            for(int i=0;i<list.get(node).size();i++){
                if(!visited[list.get(node).get(i)]){
                    qu.add(list.get(node).get(i));
                    visited[list.get(node).get(i)]=true;
                }
            }
        }
    }
    // dfs
    public void dfs_graph(int startVertex,ArrayList<ArrayList<Integer>> list){
        boolean visited[] =new boolean[numVertex];
        dfs_helper(startVertex,visited);
    }
    public void dfs_helper(int startVertex,boolean visited[]){
        visited[startVertex]=true;
        System.out.print(startVertex+" ");
        for(int i=0;i<list.get(startVertex).size();i++){
            if(!visited[list.get(startVertex).get(i)]){
                dfs_helper(list.get(startVertex).get(i), visited);

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int numVertex=sc.nextInt();
        System.out.println("Enter the vertex that will be start ");
        int startVertex=sc.nextInt();
        bfs_and_dfs graph=new bfs_and_dfs(numVertex);
        System.out.println("Enter the number of edges");
        int numEdges=sc.nextInt();
        System.out.println("Enter the edges");
        for(int i=0;i<numEdges;i++){
            int src=sc.nextInt();
            int des=sc.nextInt();
            graph.addEdge(src, des);
        }

        // for(int i=0;i<graph.numVertex;i++){
        //     System.out.print(i+" is connected to ");
        //     for(int j=0;j<graph.list.get(i).size();j++){
        //         System.out.print(graph.list.get(i).get(j)+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println("BFS traversal of graph is ");
        graph.bfs_graph(startVertex, graph.list);
        System.out.println();
        System.out.println("DFS traversal of graph is ");
        graph.dfs_graph(startVertex, graph.list);
    }
}
