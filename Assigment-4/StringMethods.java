import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2=s1;
        String s3=new String("Welcome to Java");
        String s4=s1.intern();

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s4==s1);

        String s5 = "welcome to java";
        System.out.println(s1.equalsIgnoreCase(s5));
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s2 == s4);
        System.out.println(s1 + s2);
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf('j'));
        System.out.println(s1.indexOf("to"));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.lastIndexOf("o", 15));
        System.out.println(s1.codePointCount(0, s1.length()));
        System.out.println(s1.length());
        System.out.println(s1.substring( 3));
        System.out.println(s1.substring(1, 3));
        System.out.println(s1.startsWith("Wel"));
        System.out.println(s1.endsWith("Java"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println("    Hi".trim());
        System.out.println(s1.replace('o', 'O'));
        System.out.println(s1.replaceAll("o", "O"));
        System.out.println(s1.replaceFirst("o", "O"));
        System.out.println(Arrays.toString(s1.split(" ")));
        System.out.println(Arrays.toString(s1.split(" ", 3)));
        System.out.println(s1.toCharArray());
        System.out.println(s1.codePointAt(0));
        System.out.println(s1.contains("or"));
        System.out.println(String.join("-", s1, s2, s3));
    }
}

