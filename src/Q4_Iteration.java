import java.util.Scanner;

public class Q4_Iteration{
    public static void main(String args[]) {
        int n = new Scanner(System.in).nextInt();
        iterator(n);
    }

    public static void iterator(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j=i;j>0;j--)
                System.out.print(i);

        }
    }
}

