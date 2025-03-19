import java.util.Scanner;
public class Main {
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(int n){
        int sum = 0;
        while(n>=1){
            sum+=n%10;
            n/=10;
        }
        if(sum%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        // Please write your code here.
        for(int i=a;i<=b;i++){
            if(isEven(i)&&isPrime(i)){
                count++;
            }
        }
        System.out.print(count);
    }
}