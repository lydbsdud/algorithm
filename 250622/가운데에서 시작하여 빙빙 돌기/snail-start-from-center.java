import java.util.Scanner;

public class Main {
    public static boolean isGrid(int x, int y, int n){
        return x>=0&&y>=0&&x<n&&y<n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dx = new int[]{0, -1, 0 , 1};
        int[] dy = new int[]{-1, 0, 1, 0};
        int nx = n-1;
        int ny = n-1;
        int x = n-1;
        int y = n-1;
        int dir = 0;
        int[][] xy = new int[n][n];
        xy[n-1][n-1] = n*n;
        for(int i=n*n-1;i>0;i--){
            nx = nx+dx[dir];
            ny = ny+dy[dir];
            if(!isGrid(nx, ny, n)||xy[nx][ny]>0){
                dir = (dir+1)%4;
            }
            x = x+dx[dir];
            y = y+dy[dir];
            nx = x;
            ny = y;
            xy[x][y] = i;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(xy[i][j]+" ");
            }
            System.out.println();
        }
    }
}