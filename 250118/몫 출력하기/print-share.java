import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            int n ;
            n= sc.nextInt();
            if(n%2==1){
                continue;
            }
            System.out.println(n/2);
            count++;
            if(count==3){
                break;
            }
        }        
    }
}