import java.util.Scanner;
public class Main {
    static int count = 0;
    public static int count(int n){
        if(n==1){
            return count;
        }
        if(n%2==0){
            count++;
            return count(n/2);
        }
        count++;
        return count(3*n+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(count(n));
    }
}