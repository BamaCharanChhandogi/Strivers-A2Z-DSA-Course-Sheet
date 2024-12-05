import java.util.ArrayList;
import java.util.Scanner;

public class Cycle_detection_undirected_dfs {
    public ArrayList<ArrayList<Integer>> list;
    private int numVertex;

    public Cycle_detection_undirected_dfs(int numVertex) {
        this.numVertex = numVertex;
        list = new ArrayList<>(numVertex);
        for (int i = 0; i < numVertex; i++) {
            list.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int des) {
        list.get(src).add(des);
        list.get(des).add(src);
    }

    // DFS-based cycle detection for an undirected graph
    public boolean cycle_detection(int startVertex) {
        boolean visited[] = new boolean[numVertex];
        return cycle_helper(startVertex, -1, visited);
    }

    private boolean cycle_helper(int node, int parent, boolean[] visited) {
        visited[node]=true;
        for(int ng:list.get(node)){
            if(parent==ng) continue;
            if(visited[ng]) return true;
            if(cycle_helper(ng,node,visited)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int numVertex = sc.nextInt();
        System.out.println("Enter the starting vertex:");
        int startVertex = sc.nextInt();
        
        Cycle_detection_undirected_dfs graph = new Cycle_detection_undirected_dfs(numVertex);
        System.out.println("Enter the number of edges:");
        int numEdges = sc.nextInt();
        System.out.println("Enter the edges (source destination):");
        
        for (int i = 0; i < numEdges; i++) {
            int src = sc.nextInt();
            int des = sc.nextInt();
            graph.addEdge(src, des);
        }

        if (graph.cycle_detection(startVertex)) {
            System.out.println("Cycle is present");
        } else {
            System.out.println("Cycle is not present");
        }
    }
}
