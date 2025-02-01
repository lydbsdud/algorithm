import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[101];
        for(int i=0;i<101;i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                break;
            }
            if(arr[i]%2==0){
                System.out.print((arr[i]/2)+" ");
            }
            else{
                System.out.print((arr[i]+3)+" ");
            }
        }

    }
}