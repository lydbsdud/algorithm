import java.util.Scanner;
public class Main {
    public static void Hello(int n){
        if(n==0){
            return;
        }
        System.out.println("HelloWorld");
        Hello(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Hello(n);
    }
}