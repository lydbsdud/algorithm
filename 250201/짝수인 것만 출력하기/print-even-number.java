import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[10];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}