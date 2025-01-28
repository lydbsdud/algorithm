import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[10];
        int k = 10; 
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0){
                k=i;
                break;
            }
        }
        for(int j=k-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
    }
}