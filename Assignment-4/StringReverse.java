import java.util.Scanner;

class StringReverse {
    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        char[] newStr = str.toCharArray();
        
        int left = 0;
        int right = newStr.length - 1;
        while(left < right) {
            char temp = newStr[left];
            newStr[left] = newStr[right];
            newStr[right] = temp;
            left++;
            right--;
        }
        System.out.println(newStr);

        sc.close();
    }
}
