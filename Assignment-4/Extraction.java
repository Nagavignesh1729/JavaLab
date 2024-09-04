import java.util.Scanner;

class Extraction {
    public static void main(String[] args) {
        String ex = new String();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        ex = sc.nextLine();

        String res = "";
        for(int i=0; i<ex.length(); i++) {
            char ch = ex.charAt(i);
            if(ch >= '0' && ch <= '9')
                res += ch;
        }
        System.out.println(res);
        sc.close();
    }
}

