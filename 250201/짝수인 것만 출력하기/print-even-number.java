import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int j = 0;
        for(int i=0; i<n;i++){
            int x = sc.nextInt();
            if(x%2==0){
                arr[j]=x;
                System.out.print(arr[j]+" ");
            }
            j++;
        }
    }
}