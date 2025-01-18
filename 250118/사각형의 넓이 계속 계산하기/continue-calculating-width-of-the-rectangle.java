import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            String st = sc.next();
            char s = st.charAt(0);
            System.out.println(a*b);
            if(s=='C'){
                break;
            }
        }
    }
}