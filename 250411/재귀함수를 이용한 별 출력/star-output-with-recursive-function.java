import java.util.Scanner;
public class Main {
    static int a = 1;
    public static void star(int n){
        if(a==n+1){
            return;
        }
        for(int i=0;i<a;i++){
            System.out.print("*");
        }
        System.out.println();
        a++;
        star(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        star(n);
    }
}