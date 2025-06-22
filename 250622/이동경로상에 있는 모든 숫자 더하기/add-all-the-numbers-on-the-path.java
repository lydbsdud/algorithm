import java.util.Scanner;

public class Main {
    public static boolean isGrid(int x, int y, int n){
        return x>=0&&y>=0&&x<n&&y<n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        int dir = 0;
        int nx = (n-1)/2;
        int ny = (n-1)/2;
        int sum = board[nx][ny];
        for(int i=0;i<commands.length();i++){
            if(commands.charAt(i)=='R'){
                dir = (dir+1)%4;
            }
            else if(commands.charAt(i)=='L'){
                dir = (dir+3)%4;
            }
            else if(commands.charAt(i)=='F'){
                if(isGrid(nx+dx[dir], ny+dy[dir],n)){
                    nx = nx+dx[dir];
                    ny = ny+dy[dir];
                    sum+=board[nx][ny];
                }
            }
        }
        System.out.print(sum);
    }
}