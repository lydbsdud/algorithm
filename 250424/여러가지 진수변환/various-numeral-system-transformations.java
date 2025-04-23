import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[1000];
        int b = sc.nextInt();
        // Please write your code here.
        while(true){
            if(n<b){
                arr[cnt++] = n;
                break;
            }
            arr[cnt++] = n%b; 
            n/=b;
        }
        for(int i=cnt-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }

}