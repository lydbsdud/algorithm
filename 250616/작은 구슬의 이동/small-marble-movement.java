import java.util.Scanner;

public class Main {
    public static int gridNum(char ch){
        if(ch=='U'){
            return 3;
        }
        else if(ch=='D'){
            return 0;
        }
        else if(ch=='R'){
            return 1;
        }
        return 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        String D = sc.next();
        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, 1, -1 ,0};
        int dir = gridNum(D.charAt(0));
        int nx = R;
        int ny = C;
        for (int i=0; i<T;i++){
            if(ny==N&&dir==1){
                dir = 2;
                continue;
            }
            if(ny==1&&dir==2){
                dir = 1;
                continue;
            }
            if(nx==1&&dir==3){
                dir = 0;
                continue;
            }
            if(nx==N&&dir==0){
                dir = 3;
                continue;
            }
            nx+=dx[dir];
            ny+=dy[dir];
        }
        System.out.print(nx+" "+ny);

    }
}