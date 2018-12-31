import java.util.Scanner;

public class Q5_Integer_Sum {
    public static void main(String args[]){
        summ();

    }
    public static void summ(){
        int number;
        Scanner input=new Scanner(System.in);
        boolean test=true;
        int sum=0;
        while(test==true){
            if(input.hasNextInt()){
                number=input.nextInt();
                sum+=number;
            }
            else if(!input.hasNextInt()){
                System.out.println("Not an Integer");
                test=false;
            }
        }
        if(sum>0) { System.out.println(sum); }
    }
}

