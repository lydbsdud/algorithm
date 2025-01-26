import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<2*n;i++){
            if(i%2==0){
                for(int t=0;t<n-i/2;t++){
                    System.out.print("* ");
                }
            }
            else{
                for(int m=0;m<(i+1)/2;m++){
                    System.out.print("* ");
                }
            }
        System.out.println();
        }
    }
}