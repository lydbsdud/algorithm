import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        int dx[] = new int[]{0, 1, 0, -1};
        int dy[] = new int[]{1, 0, -1, 0};
        int nx = 0;
        int ny = 0;
        int dir = 3;
        int k =-1;
        for(int i=0;i<commands.length();i++){
            if(commands.charAt(i)=='F'){
                nx = nx + dx[dir];
                ny = ny + dy[dir];
            }else if(commands.charAt(i)=='L'){
                dir = (dir+1)%4;
            }else if(commands.charAt(i)=='R'){
                dir = (dir+3)%4;
            }
            if(nx==0 && ny==0){
                k =i+1;
                System.out.print(k);
                break;
            }
        }
        if(k==-1){
            System.out.print(k);
        }
    }
}