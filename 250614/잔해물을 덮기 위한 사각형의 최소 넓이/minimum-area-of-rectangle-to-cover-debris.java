import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();
        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();
        
        int[][] xy = new int[2001][2001];
        for(int i=rect1_x1+1000;i<rect1_x2+1000;i++){
            for(int j = rect1_y1+1000;j<rect1_y2+1000;j++){
                xy[i][j]=1;
            }
        }
        for(int i=rect2_x1+1000;i<rect2_x2+1000;i++){
            for(int j = rect2_y1+1000;j<rect2_y2+1000;j++){
                xy[i][j]=0;
            }
        }
        int maxX = 0;
        int minX = 2000;
        int maxY = 0;
        int minY = 2000;
        for(int i=0;i<2001;i++){
            for(int j = 0;j<2001;j++){
                if(xy[i][j]==1){
                    if(i<minX){
                        minX=i;
                    }
                    if(j<minY){
                        minY=j;
                    }
                    if(i>maxX){
                        maxX=i;
                    }
                    if(j>maxY){
                        maxY=j;
                    }
                }
            }
        
        }
        System.out.print((maxX-minX+1)*(maxY-minY+1));
    }
}