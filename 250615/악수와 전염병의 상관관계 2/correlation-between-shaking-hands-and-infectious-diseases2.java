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
        int[][] a = new int[N][2];
        a[P-1][0]=1;
        a[P-1][1]=2;
        Arrays.sort(shakes, (x, y) -> Integer.compare(x[0], y[0]));
        for(int i=0; i<T;i++){
            if(a[shakes[i][1]-1][0]==1){
                if(a[shakes[i][2]-1][0]==1){
                    a[shakes[i][1]-1][1]--;
                    a[shakes[i][2]-1][0]--;
                }else{
                    if(a[shakes[i][1]-1][1]<1){
                        continue;
                    }
                    a[shakes[i][1]-1][1]--;
                    a[shakes[i][2]-1][0]=1;
                    a[shakes[i][2]-1][1]=2;
                }
            }else if(a[shakes[i][2]-1][0]==1)
                {
                    if(a[shakes[i][2]-1][1]<1){
                        continue;
                    }
                    a[shakes[i][1]-1][0]=1;
                    a[shakes[i][1]-1][1]=2;
                    a[shakes[i][2]-1][1]--;
                }
            }
        for(int i=0;i<N;i++){
            System.out.print(a[i][0]);
        }
    }
}