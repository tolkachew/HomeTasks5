import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n" + "Enter which array element to find - (min/max) ? ");
        String minmax = sc.nextLine();
        int[] arr = new int[30];
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 121) - 70);
            System.out.print(arr[i] + " ");
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        switch (minmax) {
            case "max":
                System.out.println("\n" + "Max element: " + max);
                break;
            case "min":
                System.out.println("\n" + "Min element: " + min);
                break;
            default:
                System.out.println("\n" + "Error! \nEnter 'min' or 'max.");
        }
    }
}
/*
Task 2
Fill an array of 30 elements with random numbers from -70
to +50. Find the minimum element and output it to the console.
Find the maximum element and output it to the console.
 */

