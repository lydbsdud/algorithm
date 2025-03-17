import java.util.Scanner;

public class Main {
    public static int multi(int a, int b){
        int mu = 1;
        for(int i=0;i<b;i++){
            mu*=a;
        }
        return mu;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int result = multi(a,b);
        System.out.print(result);
    }
}