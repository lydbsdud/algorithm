import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int arrCount[] = new int[7];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            arrCount[arr[i]]++;
        }
        for(int i=1;i<7;i++){
            System.out.print(i+" - "+arrCount[i]+"\n");
        }
    }
}