import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner (System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        if(b%2==0){
            while(b>=a){
                System.out.print(b+" ");
                b-=2;
            }
        }
        if(b%2==1){
            while(b-1>=a){
                System.out.print((b-1)+" ");
                b-=2;
            }
        }
    }
}