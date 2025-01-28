import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=2;i<=8;i+=2){
            for(int t=b;t>=a;t--){
                System.out.print(t+" * "+i+" = "+(t*i));
                if(t>a){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}