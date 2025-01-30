import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[10];
        int sum1 = 0;
        int count = 0;
        double sum2 = 0;
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            if(i%2!=0){
                sum1+=arr[i];
            }
            if((i+1)%3==0){
                sum2+=arr[i];
                count++;
            }
        }
        double avg=sum2/count;
        System.out.printf("%d %.1f",sum1,avg);
    }
}