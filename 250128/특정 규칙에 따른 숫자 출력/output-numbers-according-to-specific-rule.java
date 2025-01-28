import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =1;
        for(int i=0;i<n;i++){
            for(int a=0; a<i;a++){
                System.out.print("  ");
            }
            for(int t=0;t<n-i;t++){
                System.out.print(cnt+" ");
                cnt++;
                if(cnt==10){
                    cnt=1;
                }
            }
            System.out.println();
        }
    }
}