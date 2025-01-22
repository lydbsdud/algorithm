import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int t=0;t<-i+n;t++){
                System.out.print("*");
            }
            for(int k=0;k<2*i;k++){
                System.out.print(" ");
            }
            for(int m=0;m<-i+n;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}