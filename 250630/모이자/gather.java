import java.util.*;
public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int minSum = INT_MAX;
        for (int i=0; i<n; i++){
            int sum = 0;
            for(int t=0 ; t<n;t++){
                sum += a[t]*Math.abs(i-t);
            }
            if(minSum>sum){
                minSum = sum;
            }
        }
        System.out.print(minSum);
    }
}