import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q7_even_digit_sum {
    public static void main(String args[]) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int rem = 0;
        int n = 0;
        List<Integer> list = new ArrayList<>();
        while (number != 0) {
            rem = number % 10;
            list.add(rem);
            number = number / 10;
            n++;
        }
        int sum = 0;
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                sum += list.get(i);
            }
        }
        if (sum > 15)
            System.out.println("greater than 15 trur");
        else System.out.println("false");

    }

    }
