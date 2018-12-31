import java.util.Scanner;


public class Q9_String_Reverse {
    public static void main(String args[]) {
        String s;
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        reverse(s);
    }


    public static void reverse(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res = res + s.charAt(i);
        }

        System.out.println(res);
    }
}