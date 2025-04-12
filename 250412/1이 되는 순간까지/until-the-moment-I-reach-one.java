import java.util.Scanner;
public class Main {
    static int a = 0;
    public static int count(int n){
        if(n==1){
            return a;
        }
        if(n%2==0){
            a++;
            return count(n/2);
        }
        a++;
        return count(n/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(count(n));
    }
}