import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int max = 0;
        int result = 0;
        for(int i=0;i<n-1;i++){
            result += Math.abs(x[i+1]-x[i])+Math.abs(y[i+1]-y[i]);
        }
        for(int i=0;i<n-2;i++){
            int run1 = Math.abs(x[i+1]-x[i])+Math.abs(y[i+1]-y[i]);
            int run2 = Math.abs(x[i+2]-x[i+1])+Math.abs(y[i+2]-y[i+1]);
            int skip = Math.abs(x[i+2]-x[i])+Math.abs(y[i+2]-y[i]);
            int skipDistance = (run1+run2) - skip;
            max = Math.max(skipDistance, max);
        }
        
        System.out.print(result-max);
    }
}