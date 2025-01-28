import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k = 0;
        int brr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            if(arr[i]%2==0){
                brr[k]= arr[i];
                k++;
            }
        }
        for(int j=k-1;j>=0;j--){
                System.out.print(brr[j]+" ");
            }
    }
}