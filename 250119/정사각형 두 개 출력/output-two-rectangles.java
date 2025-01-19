import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<2;i++){
            for(int t=0;t<n;t++){
                for(int m=0;m<n;m++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}