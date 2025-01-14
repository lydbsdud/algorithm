import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        if(a%2==1){
            while(a+1<=b){
                System.out.print((a+1)+" ");
                a+=2;
            }
        }
        if(a%2==0){
            while(a<=b){
                System.out.print(a+" ");
                a+=2;
            }
        }
    }
}