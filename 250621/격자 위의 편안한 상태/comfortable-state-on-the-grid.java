import java.util.Scanner;
public class Main {
    public static boolean isGrid(int x , int y, int n){
        return (x>=0&&x<n)&&(y>=0&&y<n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int[][] xy = new int[n+1][n+1];
        for(int i=0;i<m;i++){
            int count = 0;
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            xy[x][y]=1;
            for(int j=0;j<4;j++){
                if((isGrid(x+dx[j],y+dy[j],n) )&& (xy[x+dx[j]][y+dy[j]]==1)){
                    count++;
                }
            }
            if(count==3){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}