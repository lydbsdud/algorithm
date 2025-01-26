import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=0;i<2*n+1;i++){
            for(int t=0;t<2*n+1;t++){
                if(i%2==0||t%2==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}