import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int t=0;t<2*n-4-i;t++){
                System.out.print(" ");
            }
            for(int m=0;m<1+i;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int t=0;t<1+i;t++){
                System.out.print(" ");
            }
            for(int m=0;m<n-1-i;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}