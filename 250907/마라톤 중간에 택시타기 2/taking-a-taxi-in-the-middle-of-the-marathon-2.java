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
        int t = -1;
        int max = 0;
        int result = 0;
        for(int i=0;i<n-2;i++){
            if(Math.abs(x[i+1]-x[i])+Math.abs(y[i+1]-y[i])>max){
                max = Math.abs(x[i+1]-x[i])+Math.abs(y[i+1]-y[i]);
                t = i;
            }
        }
        for(int i = 0;i<n-1;i++){
            if(i == t){
                result+=Math.abs(x[i+2]-x[i])+Math.abs(y[i+2]-y[i]);
                i++;
                continue;
            }
            result+=Math.abs(x[i+1]-x[i])+Math.abs(y[i+1]-y[i]);
        }
        System.out.print(result);
    }
}