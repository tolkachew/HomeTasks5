public class FibArrEven {
    public static void main(String[] args) {
        int[] arr = new int[15];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int j : arr) {
            if (j % 2 == 0)
                System.out.print(j + " ");
        }
    }
}
/*
Task 1
Fill an array of 15 elements with Fibonacci numbers.
Output only the even elements of the array to the console.
 */
