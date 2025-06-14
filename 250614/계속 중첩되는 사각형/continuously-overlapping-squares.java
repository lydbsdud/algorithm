import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int M = 100;
        int count = 0;
        int[][]xy = new int[201][201];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            if(i%2==0){
                for(int j=x1+M;j<x2+M;j++){
                    for(int k=y1+M;k<y2+M;k++){
                        xy[j][k]=1;
                    }
                }
            }else{
                for(int j=x1+M;j<x2+M;j++){
                    for(int k=y1+M;k<y2+M;k++){
                        xy[j][k]=2;
                    }
                }
            }
        }
        for(int j=0;j<201;j++){
            for(int k=0;k<201;k++){
                if(xy[j][k]==2){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}