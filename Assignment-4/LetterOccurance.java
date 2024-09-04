import java.util.Scanner;

public class LetterOccurance {
    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        int[] countChar = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                countChar[index]++;
            }
        }

        System.out.println("Letter occurrences in the given string:");
        for (int i = 0; i < countChar.length; i++) {
            if (countChar[i] > 0) {
                char letter = (char) (i + 'a');
                System.out.println(letter + ": " + countChar[i]);
            }
        }
    }
}

