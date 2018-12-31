import java.util.Scanner;

public class Q6_Character_Case {

    public static void  main(String args[]) {
        char ch = new Scanner(System.in).next().charAt(0);
        if (ch >= 65 && ch <= 90)
            System.out.println("capitol letter");
        else if (ch >= 97 && ch <= 122)
            System.out.println("small letter");

        else if (ch >= 48 && ch <= 57)
            System.out.println("digit");
        else if ((ch > 0 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 127))
            System.out.println("special character");
    }


}
