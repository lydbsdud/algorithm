import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int num = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = num;
                num+=1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
/* 
(0,0)(1,0)(2,0)
(0,1)(1,1)(2,1)
(0,2)(1,2)(2,2)

*/