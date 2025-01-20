import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int t=1;t<=i;t++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int t=i;t>0;t--){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
}