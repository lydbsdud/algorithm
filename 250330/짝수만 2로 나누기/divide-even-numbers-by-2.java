import java.util.Scanner;
public class Main {
    public static int even(int n){
        if(n%2==0){
            n/=2;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            System.out.print(even(arr[i])+" ");
        }
        // Please write your code here.
    }
}