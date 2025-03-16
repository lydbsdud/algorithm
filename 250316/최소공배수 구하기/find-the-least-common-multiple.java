import java.util.Scanner;

public class Main {
    public static void multiple(int n, int m){
        int min = 0;
        if(n>=m){
            for(int i=1;i<=100;i++){
                if((i*n)%m==0){
                    min=i*n;
                    break;
                }
            }
        }
        if(n<m){
            for(int i=1;i<=100;i++){
                if((i*m)%n==0){
                    min=i*m;
                    break;
                }
            }
        }
        System.out.print(min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        multiple(n,m);
    }
}