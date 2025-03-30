import java.util.Scanner;

public class Main {
    public static String aue (int a, int b){
        if(a>=b){
            a+=25;
            b*=2;
        }
        else{
            a*=2;
            b+=25;
        }
        return(a+" "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.print(aue(a,b));
    }
}