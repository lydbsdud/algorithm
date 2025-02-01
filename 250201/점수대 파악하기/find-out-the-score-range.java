import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        int arrCount[] = new int[11];
        for(int i=0;i<100;i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                break;
            }
            arrCount[arr[i]/10]++;
        }
        for(int i=10;i>0;i--){
            System.out.print((i*10)+" - "+ arrCount[i]+"\n");
        }
    }
}