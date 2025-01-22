import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int t=0;t<(2*n-2)-2*i;t++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}