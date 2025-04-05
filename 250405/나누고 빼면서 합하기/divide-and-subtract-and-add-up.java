import java.util.Scanner;
public class Main {
    static int[] arr;

    public static void isM(int m){
        int sum = 0;
        while(m!=1){
            sum+=arr[m];
            if(m%2==0){
                m/=2;
            }
            else{
                m-=1;
            }
        }
        sum+=arr[1];
        System.out.print(sum);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    arr = new int[n + 1];
    for (int i = 1; i <= n; i++)
        arr[i] = sc.nextInt();
        // Please write your code here.
    isM(m);
    }
}