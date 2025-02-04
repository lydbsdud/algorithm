import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int count = 1;
        int num =1;
        int[][] arr = new int [n][n];
        for(int j=n-1;j>=0;j--){
            if(x%2==0){
                for(int i=n-1;i>=0;i--){
                    arr[i][j]=num;
                    num++;
                }
                x++;
            }
            else{
                for(int i=0;i<=n-1;i++){
                    arr[i][j]=num;
                    num++;
                }
                x++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}