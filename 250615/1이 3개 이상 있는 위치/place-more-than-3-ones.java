import java.util.Scanner;
public class Main {
    public static boolean isGrid(int x, int y, int n){
        return (x<n)&&(y<n)&&(x>=0)&&(y>=0);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        int nx, ny;
        int count =0 ;
        int reCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = i;
                int y = j;
                for(int k=0;k<4;k++){
                    nx = x+dx[k];
                    ny = y+dy[k];
                    if(isGrid(nx,ny,n)&&arr[nx][ny]==1){
                        count++;
                    }  
                }
                if(count>=3){
                    reCount++;
                }
                count = 0;
            }
        }
        System.out.print(reCount);
    }
}