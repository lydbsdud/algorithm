import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[][] xy = new int[201][201];
        int count = 0;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            for(int j=x[i]+100;j<x[i]+108;j++){
                for(int k=y[i]+100;k<y[i]+108;k++){
                    xy[j][k]=1;
                }
            }
        }
        for(int j=0;j<201;j++){
            for(int k=0;k<201;k++){
                if(xy[j][k]==1){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}