import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        for (int i = a+n; i<=n*n-n+(a+n); i+=n ){
            System.out.println(i);
        }
    }
}