import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int sum = 0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0; j<i+1;j++)
                sum+=arr[i][j];
        }
        System.out.print(sum);
    }
}
/*
j=0 일 때 i=0,1,2,3
j=1 일 때 i=0,1,2
j=2 일 때 i=0,1
j=3 일 때 i=0
*/