import java.util.Scanner;
public class Main {
    public static int isDir(char ch){
        if(ch=='W'){
            return 2;
        }else if(ch=='S'){
            return 1;
        }else if(ch=='N'){
            return 3;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dx[] = new int[]{0, 1, 0, -1};
        int dy[] = new int[]{1, 0, -1, 0};
        int n = sc.nextInt();
        int nx = 0;
        int ny =0;
        int t =0;
        int k = -1;
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();
            for(int j=0; j<dist;j++){
                nx = nx+dx[isDir(dir)];
                ny = ny+dy[isDir(dir)];
                t++;
                if(nx==0&& ny==0){
                    k = t;
                    System.out.print(k);
                }
            }
        }
        if(k==-1){
            System.out.print(k);
        }
    }
}