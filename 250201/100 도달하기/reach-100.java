import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[100];
        arr[0] = 1;
        arr[1] = n;
        int i=0;
        System.out.print(arr[0]+" "+arr[1]+" ");
        while(true){
            arr[i+2]=arr[i+1]+arr[i];
            System.out.print(arr[i+2]+" ");
            if(arr[i+2]>100){
                break;
            }
            i++;
        }
    }
}