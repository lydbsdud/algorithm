import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int a=0;a<i;a++){
                System.out.print("  ");
            }
            for(int t=n-i;t>0;t--){
                System.out.print(t+" ");
            }
            System.out.println();
        }
    }
}