import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arrCount = new int[1001];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            arrCount[arr[i]]++;
        }
        int max = -1;
        for(int i=0;i<1001;i++){
            if(arrCount[i]==1&&i>=max){
                max=i;
            }
        }
        System.out.print(max);
    }
}