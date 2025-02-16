import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int aCount=0;
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
            if(arr[i].charAt(0)=='a'){
                aCount++;
            }
            for(int j=0;j<arr[i].length();j++){
                count++;
            }
        }
        System.out.print(count+" "+aCount);
    }
}