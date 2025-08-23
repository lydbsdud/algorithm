import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        for(int i=0; i<n; i++)
            for(int j=0;j<n-2;j++){
                count = Math.max(count, grid[i][j]+grid[i][j+1]+grid[i][j+2]);
            }
        System.out.print(count);

    }
}