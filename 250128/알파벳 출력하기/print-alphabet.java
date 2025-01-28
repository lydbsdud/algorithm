import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print((char)x);
                x++;
                if(x=='['){
                    x='A';
                }
            }
            System.out.println();
        }
    }
}