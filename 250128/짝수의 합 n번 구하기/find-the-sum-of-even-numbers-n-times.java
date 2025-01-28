import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum=0;
            if(a%2==0){
                for(int k=a; k<=b;k+=2){
                    sum+=k;
                }
            }
            else{
                for(int j=a+1; j<=b;j+=2){
                    sum+=j;
                }
            }
            System.out.println(sum);
            }

    }
}