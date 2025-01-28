import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=1;
        for(int i=0;i<n;i++){
            for(int t=0;t<i+1;t++){
                System.out.print(cnt+" ");
                cnt++;
            }
            System.out.println();
        }
    }
}