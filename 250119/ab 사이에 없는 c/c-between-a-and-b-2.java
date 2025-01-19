import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean x = false;
        for(int i=a;i<=b;i++){
            if(i%c==0){
                x=true;
            }
        }
        if(x==true){
            System.out.print("NO");
        }
        else{
            System.out.print("YES");
        }
    }
}