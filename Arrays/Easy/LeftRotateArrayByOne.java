public class LeftRotateArrayByOne {
    public static void leftRotateByOne(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotateByOne(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
