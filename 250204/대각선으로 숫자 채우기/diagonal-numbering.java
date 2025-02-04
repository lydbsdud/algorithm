import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 1; 
        int[][] arr = new int[n][m];
        for(int j=0;j<m;j++){
            int k = j;
            for(int i=0;i<n;i++){
                if(k<0){
                    break;
                }
                arr[i][k] = num;
                num++;
                k--;
            }
        }
        for(int i=1;i<=n-1;i++){
            int k = i ;
            for(int j=m-1;j>=0;j--){
                if(k==n){
                    break;
                }
                arr[k][j] = num;
                num++;
                k++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*

(0,0),
(0,1),(1,0)
(0,2),(1,1),(2,0),
(1,2),(2,1)
(2,2)
j로 부터 i가 1씩 커지면 j는 1씩 줄어듦.
j=i 가 될 때까지.

*/