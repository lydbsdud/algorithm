import java.util.Scanner;
public class Main {
    public static int F(int[] arr, int n){
        if(n==0){
            return arr[n];
        }
        int max = F(arr,n-1);
        return Math.max(arr[n],max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.print(F(arr,n-1));
    }
}