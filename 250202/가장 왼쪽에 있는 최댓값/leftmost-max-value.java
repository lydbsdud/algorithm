import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];
        boolean running = true;
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        while (true){
            int max = 0;
            int idx = n;
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    max=arr[i];
                    idx = i;
                }
            }
            System.out.print(idx+1+" ");
            if(idx==0){
                break;
            }
            n=idx;
        }
    }
}