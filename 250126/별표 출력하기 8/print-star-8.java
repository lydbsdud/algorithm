import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            if(i%2==0){
                for(int t=0; t<i;t++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("*");
            }
            System.out.println();
        }
    }
}