package LearnImportantSortingTechniques.Sorting1;

public class Insertion {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 43, 12, 13, 0 };
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int k = i - 1;
            while (k >= 0 && arr[k] > temp) {
                arr[k + 1] = arr[k];
                k--;
            }
            arr[k + 1] = temp;
        }
        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
