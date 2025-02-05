import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        int[][] arr = new int[n][n];
    
        for(int i=0;i<n;i++){
            for(int j=0;j<x;j++){
                if(j==x-1 || j==0){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                System.out.print(arr[i][j]+" ");
            }
            x++;
            System.out.println();
        }
    }
}