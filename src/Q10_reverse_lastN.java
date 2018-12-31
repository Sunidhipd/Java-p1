import java.util.Scanner;


public class Q10_reverse_lastN {
    public static void main(String args[]) {
        String s;
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        int n = input.nextInt();
        String res = s.substring(s.length() - n);
        appendedword(s,res, n);

    }

    public static void appendedword(String s,String res, int n) {
        String result = "",rep="";

        while(n!=0){
            rep+=res;
            n--;
        }
        result=s+rep;
        System.out.println(result);

    }
}
