import java.util.Scanner;
public class Main {
    static int a = 1;
    public static void plus(int n){
        if(a==n+1){
            System.out.println();
            minus(n);
            return;
        }
        System.out.print(a+" ");
        a++;
        plus(n);
    }
    public static void minus(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        minus(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        plus(n);
    }
}