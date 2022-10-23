import java.util.Scanner;

public class LettersMore3times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter latin letters: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        int[] indexChars = new int[1200];
        for (int i = 0; i < c.length; i++) {
            indexChars[c[i]]++;
        }
        for (int i = 0; i < indexChars.length; i++) {
            if (indexChars[i] >= 3)
                System.out.println("Letter " + (char) i + " : " + indexChars[i] + " times.");
        }
    }
}
/*
Task 8
Fill an array of dimension n with random lowercase Latin
letters. Calculate how many times each letter occurs. Output
letters that occur more than 3 times. n is specified from the
keyboard.
 */