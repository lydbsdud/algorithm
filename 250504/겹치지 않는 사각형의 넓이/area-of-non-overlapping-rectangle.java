import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();
        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();
        int w1=(ax2-ax1)*(ay2-ay1);
        int w2=(bx2-bx1)*(by2-by1);
        int w3 = F( ax1, ay1, ax2, ay2, mx1, my1, mx2, my2)+F(bx1, by1,bx2,by2, mx1, my1, mx2, my2);
        System.out.print(w1+w2-w3);
    }

    public static int F(int ax1, int ay1, int ax2, int ay2,
    int bx1, int by1, int bx2, int by2){
        if(ax2<=bx1&&ay2<=by1){
            return 0;
        }
        int x = Math.min(ax2,bx2)-Math.max(ax1,bx1);
        int y = Math.min(ay2,by2)-Math.max(ay1,by1);
        return x*y;
    }
        
}