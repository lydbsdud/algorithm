import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int i=0;
        int arr[] = new int[100];
        while(i<100){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                System.out.print(arr[i-1]+arr[i-2]+arr[i-3]);
                break;
            } 
            i++;
        }
    }
}