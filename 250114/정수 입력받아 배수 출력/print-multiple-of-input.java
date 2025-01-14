import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=n; i<=5*n;i+=n){
            System.out.print(i+" ");
        }
    }
}