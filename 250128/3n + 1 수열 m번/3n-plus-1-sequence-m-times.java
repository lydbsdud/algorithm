import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int n = sc.nextInt();
            int k = 0;
            while(true){
                if(n==1){
                    System.out.println(k);
                    break;
                }
                if(n%2==0){
                    n/=2;
                    k++;
                    continue;
                }
                n=3*n+1;
                k++;
            }
        }

    }
}