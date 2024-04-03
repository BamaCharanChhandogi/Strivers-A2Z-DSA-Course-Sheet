package Binary_Trees.Easy;

public class Introduction_to_Trees {

        public static int numberOfNodes(int N) {
          // Calculate the number of nodes using the formula 2^(N-1)
          return (int) Math.pow(2, N - 1);
        }
      
        public static void main(String[] args) {
          int N = 3;
          int numberOfNodes = numberOfNodes(N);
          System.out.println(numberOfNodes); // Output: 6
        }
      }
