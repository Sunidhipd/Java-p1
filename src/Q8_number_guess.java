import java.util.Scanner;
import java.util.Random;
public class Q8_number_guess {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Random rand=new Random();

        //Range set from 1 to 100
        int from=1;
        int to=100;

        //Random number generator to be guessed
        int random=rand.nextInt(to-from+1)+from;

        //Declaring guessing number
        int guess=0;

        System.out.println("The number is between " + from + " and " + to);

        do
        {
            System.out.print("Guess what the number is: ");
            guess = scan.nextInt();
            if (guess > random)
                System.out.println("Number guessed is more than original number ");
            else if (guess < random)
                System.out.println("Number guessed is less than original number");
            else if(guess==random)
                System.out.println("Number guessed matches the original number");
        } while (guess != random);
    }
}