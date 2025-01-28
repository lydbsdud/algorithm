import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 'A';
        for(int i=0;i<n;i++){
            for(int b=0;b<i;b++){
                System.out.print("  ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print((char)x+" ");
                x++;
                if(x>'Z'){
                    x='A';
                }
            }
            System.out.println();
        }
    }
}