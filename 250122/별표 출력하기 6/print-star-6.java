import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int t=0;t<2*i;t++){
                System.out.print(" ");
            }
            for(int k=0;k<2*n-1-2*i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int a=0;a<-2*i+4;a++){
                System.out.print(" ");
            }
            for(int g=0;g<2*i+3;g++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
    