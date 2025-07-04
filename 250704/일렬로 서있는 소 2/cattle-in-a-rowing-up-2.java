import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            int max = arr[i];
            for(int t=i;t<n;t++){
                if(max<=arr[t]){
                    count++;
                    if(count>=3){
                        result++;
                    }
                    max = arr[t];
                }
            }
        }
        System.out.print(result);
    }
}