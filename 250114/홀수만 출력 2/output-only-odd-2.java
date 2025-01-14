import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        if(b%2==0){
            for(int i=b-1;i>=a;i-=2){
                System.out.print(i+" ");
            }
        }
        else if (b%2==1){
            for(int i=b;i>=a;i-=2){
                System.out.print(i+" ");
            }
        }
    }
}