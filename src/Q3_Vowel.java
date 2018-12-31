import java.util.Scanner;

public class Q3_Vowel {
    public static void main(String args[]) {
        String s = new Scanner(System.in).nextLine();
        check(s);
    }
    public static void check(String s){
        int len=s.length();
        boolean v=false, c= false;
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                v=true;
            }
            else{
                c=true;
            }
        }
        if( v==true && c==true)
            System.out.println("Vowel Consonant");
        if( v==true && c==false)
            System.out.println("Vowel");
        if( v==false && c==true)
            System.out.println("Consonant");
        if( v==false && c==false)
            System.out.println(" No Vowel Consonant");
    }
}
