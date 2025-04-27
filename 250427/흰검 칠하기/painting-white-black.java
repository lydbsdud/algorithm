import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int w = 0;
        int b = 0;
        int g = 0;
        int[][] arr = new int[2][200001];
        int k = 100000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            if(d=='R'){
                for(int j=k;j<k+x;j++){
                    arr[0][j]++;
                    arr[1][j] = 100;
                }
                k=k+x-1;
            }
            if(d=='L'){
                for(int j=k;j>k-x;j--){
                    arr[0][j]++;
                    arr[1][j] =-100;
                }
                k=k-x+1;
            }
        }
        for(int i=0;i<200001;i++){
            if(arr[0][i]>=4){
                g++;
            }
            else if(arr[1][i]==100){
                b++;
            }
            else if(arr[1][i]==-100){
                w++;
            }
        }
        System.out.print(w+" "+b+" "+g);
    }
}