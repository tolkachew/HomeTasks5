import java.util.Scanner;

class Symmetry {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int size = sc.nextInt();
        boolean flag = true;
        int arr[] = new int[size];
        System.out.println("Insert array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size / 2; i++) {
            if (arr[i] != arr[size - i - 1])
                flag = false;
        }
        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
/*
Task 12
The program should output the word 'yes' for a symmetric array
and the word 'no' for an asymmetric array. Symmetric array is an
array, in which values of the elements from the end is equal to the
value of elements from the beginning. The array is specified and
initialized at the beginning of the program.
Examples of values for a symmetric array:
1, 2, 3, 2, 1
2, 2, 3, 2, 2
1, 3, 2, 3, 1
5, 4, 3, 4, 5
 */

