import java.util.Scanner;

public class Q1_palindrome {
        public static void main(String args[]) {

            //Input for number to be checked as palindrome
            int n = new Scanner(System.in).nextInt();

            //calling function to check the number as palindrome
            palindrome(n);
        }
        public static void palindrome(int n){
            int rem=0,pal=0, sum=0;
            int x=n;

            //Checking if its palindrome
            while (x > 0) {
                rem=x%10;
                pal=pal*10+rem;
                x=x/10;
                if(rem%2==0) sum+=rem;
            }

            if(n==pal && sum>=25)
                System.out.println( n + "is palindrome and the sum of even numbers is greater than 25");
            else if(n==pal && sum<25) System.out.println( n + "is palindrome and the sum of even numbers is less than 25");
            else if(n!=pal) System.out.println(n + "is not palindrome");
        }

}
