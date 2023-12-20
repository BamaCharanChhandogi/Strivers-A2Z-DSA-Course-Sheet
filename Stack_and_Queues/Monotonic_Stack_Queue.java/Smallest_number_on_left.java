import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Smallest_number_on_left {
    public static List<Integer> leftSmaller(int n, int arr[])
    {
        Stack<Integer> st=new Stack<Integer>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                list.add(-1);
            }
            else{
                list.add(st.peek());
            }
            st.push(arr[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]={4,2,5,3,5};
        List<Integer> list = leftSmaller(arr.length, arr);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
