import java.util.Scanner;
public class Main {
    static int b = 1;
    public static void stair(int n, int a){
        if(b==(n+1)){
             return;
        }
        if(a==0){
            System.out.print(b+" ");
            b++;
            stair(n,a);
            return;
        }
        System.out.print(a+" ");
        stair(n,a-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int a = n;
        stair(n, a);
    }
}