import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();
        int[][] shakes = new int[T][3];
        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt();
            shakes[i][1] = sc.nextInt();
            shakes[i][2] = sc.nextInt();
        }
        Arrays.sort(shakes, (x, y) -> Integer.compare(x[0], y[0]));
        int[][] a = new int[N][2];
        a[P-1][0]=1;
        a[P-1][1]=K;
        for(int i=0;i<T;i++){
            int m = shakes[i][1]-1;
            int n = shakes[i][2]-1;
            boolean isCaX = (a[m][0]==1)&&(a[m][1]>0);
            boolean isCaY = (a[n][0]==1)&&(a[n][1]>0);
            if(isCaX && isCaY){
                a[m][1]--;
                a[n][1]--;
                continue;
            }
            else if(isCaX || isCaY){
                if(isCaX){
                    a[m][1]--;
                    a[n][0]=1;
                    a[n][1]=K;
                }
                else{
                    a[n][1]--;
                    a[m][0]=1;
                    a[m][1]=K;
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(a[i][0]);
        }
    }
}