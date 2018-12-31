import java.util.Scanner;

public class Q2_ODD_EVEN {
    public static void  main(String args[]){

        //Input
        int n=new Scanner(System.in).nextInt();

        //calling function to check odd or even number
        check(n);
    }
    public static void check(int n){
        if(n%2!=0 && n>=20 && n<=30)
            System.out.println("Tom");
        else if(n%2==0 && n>=20 && n<=30)
            System.out.println("Jerry");
    }
}