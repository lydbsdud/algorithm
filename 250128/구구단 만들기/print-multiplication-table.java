import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=9;i++){
            for(int t=b;t>=a;t-=2){
                System.out.print(t+" * "+i+" = "+(t*i));
                if(t>a){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}