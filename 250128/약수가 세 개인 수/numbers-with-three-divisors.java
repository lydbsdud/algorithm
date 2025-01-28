import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        for (int i=start;i<=end;i++){
            int num = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    num++;
                }
            }
            if(num==3){
                count++;
            }
        }
        System.out.print(count);
    }
}