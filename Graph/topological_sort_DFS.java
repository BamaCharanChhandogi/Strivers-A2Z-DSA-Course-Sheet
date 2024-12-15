import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class topological_sort_DFS {
    public ArrayList<ArrayList<Integer>> list;
    private int numVertex;

    public topological_sort_DFS(int numVertex) {
        this.numVertex = numVertex;
        list = new ArrayList<>(numVertex);
        for (int i = 0; i < numVertex; i++) {
            list.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int des) {
        list.get(src).add(des);
        // list.get(des).add(src);
    }

    // DFS-based Topological sort DAG
    public void topological_Sort(){
        boolean[] visited=new boolean[numVertex];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < numVertex; i++) {
            if (!visited[i]) {
                topological_help(i, visited, st);
            }
        }

        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
    public void topological_help(int node,boolean []visited,Stack<Integer> st){
        visited[node]=true;
        for(int lg:list.get(node)){
            if(!visited[lg]){
                topological_help(lg, visited, st);
            }
        }
        st.add(node);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int numVertex = sc.nextInt();
        System.out.println("Enter the starting vertex:");
        int startVertex = sc.nextInt();
        
        topological_sort_DFS graph = new topological_sort_DFS(numVertex);
        System.out.println("Enter the number of edges:");
        int numEdges = sc.nextInt();
        System.out.println("Enter the edges (source destination):");
        
        for (int i = 0; i < numEdges; i++) {
            int src = sc.nextInt();
            int des = sc.nextInt();
            graph.addEdge(src, des);
        }
        System.out.println("Topological Sort:");
        graph.topological_Sort();
        
    }
}
