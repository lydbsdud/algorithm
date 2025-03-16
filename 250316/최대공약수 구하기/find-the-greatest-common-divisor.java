import java.util.Scanner;

public class Main {
    public static void divisior(int n, int m){
        int max = 0;
        if(n<=m){
            for(int i=1;i<=n;i++){
                if(n%i==0&&m%i==0&&max<i){
                    max=i;
                }
            }
        }
        else if(n>m){
            for(int i=1;i<=m;i++){
                if(n%i==0&&m%i==0&&max<i){
                    max=i;
                }
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        divisior(n,m);
    }
}