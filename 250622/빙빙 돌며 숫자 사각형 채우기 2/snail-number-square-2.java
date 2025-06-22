import java.util.Scanner;
public class Main {
    public static boolean isGrid(int x, int y, int n , int m){
        return x>=0&&y>=0&&x<n&&y<m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dx = new int[]{1,0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        int[][] xy = new int[n][m];
        xy[0][0]=1;
        int nx = 0;
        int ny = 0;
        int dir = 0;
        int x = 0;
        int y = 0;
        for(int i=2;i<=n*m;i++){
            nx = nx+dx[dir];
            ny = ny+dy[dir];
            if(!isGrid(nx, ny, n, m)||xy[nx][ny]>0){
                dir = (dir+1)%4;
            }
            x = x+dx[dir];
            y = y+dy[dir];
            xy[x][y] = i;
            nx = x;
            ny = y;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(xy[i][j]+" ");
            }
            System.out.println();
        }
    }
}