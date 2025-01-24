import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int t=0;t<2*n-2-2*i;t++){
                System.out.print(" ");
            }
            for(int m=0;m<i+1;m++){
                System.out.print("@ ");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int m=0;m<-i+n-1;m++){
                System.out.print("@ ");
            }
            System.out.println();
        }
    }   
}