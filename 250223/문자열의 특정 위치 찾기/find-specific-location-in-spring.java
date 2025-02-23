import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String x = sc.next();
        if(st.indexOf(x)>=0){
            System.out.print(st.indexOf(x));
        }else{
            System.out.print("No");
        }
        
    }
}