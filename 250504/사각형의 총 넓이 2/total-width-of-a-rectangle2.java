import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        int w = 0;
        int[][] xy = new int[201][201];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
            for(int j=y1[i]+100;j<y2[i]+100;j++){
                for(int k =x1[i]+100;k<x2[i]+100;k++){
                    xy[j][k]++;
                }
            }
            w+=(x2[i]-x1[i])*((y2[i]-y1[i]));
        }
        for(int i=0;i<=200;i++){
            for(int j=0;j<=200;j++){
                if(xy[i][j]>=2){
                    w-=xy[i][j]-1;
                }
            }
        }
        System.out.print(w);
    }
}