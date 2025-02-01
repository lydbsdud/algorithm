import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[11];
        int count=0;
        for(int i=1;i<=10;i++){
            arr[i]= n*i;
            System.out.print(arr[i]+" ");
            if(arr[i]%5==0){
                count++;
                if(count==2){
                    break;
                }
            }
        }
    }
}