import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            if(direction=='W'){
                x=x+(dx[2]*distance);
            }else if(direction=='S'){
                y=y+(dy[1]*distance);
            }
            else if(direction=='N'){
                y=y+(dy[3]*distance);
            }else if(direction=='E'){
                x=x+(dx[0]*distance);
            }
        }
        System.out.print(x+" "+y);
    }
}