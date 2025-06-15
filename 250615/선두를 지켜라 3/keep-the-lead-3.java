import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][2];
        int[][] b = new int[m][2];
        int[] A = new int[1000001];
        int[] B = new int[1000001];
        int aT = 0;
        int aW = 0;
        int bT = 0;
        int bW = 0;
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            for(int j=aT+1;j<=aT+a[i][1];j++){
                aW+=a[i][0];
                A[j]=aW;
            }
            aT+=a[i][1];
        }
        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
            for(int j=bT+1;j<=bT+b[i][1];j++){
                bW+=b[i][0];
                B[j]=bW;
            }
            bT+=b[i][1];
        }
        int t = Math.max(aT,bT);
        int count = 0;
        for(int i=1;i<=t;i++){
            if((A[i-1]>=B[i-1])&&(A[i]<B[i])){
                count++;
                continue;
            }
            if((A[i-1]<=B[i-1])&&(A[i]>B[i])){
                count++;
                continue;
            }
            if((A[i-1]>B[i-1])&&(A[i]<=B[i])){
                count++;
                continue;
            }
            if((A[i-1]<B[i-1])&&(A[i]>=B[i])){
                count++;
                continue;
            }
        }
        System.out.print(count);
    }
}