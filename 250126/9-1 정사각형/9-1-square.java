import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=9;
        for(int i=0;i<n;i++){
            for(int t=0;t<n;t++){
                System.out.print(cnt);
                cnt--;
                if(cnt==0){
                    cnt=9;
                }
            }
            System.out.println();
        }
    }
}