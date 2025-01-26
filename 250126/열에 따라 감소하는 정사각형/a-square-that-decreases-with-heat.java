import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            for(int t=n;t>0;t--){
                System.out.print(t+" ");
            }
            System.out.println();
        }
    }
}