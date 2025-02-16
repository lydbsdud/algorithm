import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int count = 0;
        int aCount =0;
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        char x = sc.next().charAt(0);
        for(int i=0;i<n;i++){
            if(arr[i].charAt(0)==x){
                aCount++;
                for(int j=0;j<arr[i].length();j++){
                count++;
                }
            }
        }
        double avg = (double)count/aCount;
        System.out.printf("%d %.2f",aCount,avg);
    }
}