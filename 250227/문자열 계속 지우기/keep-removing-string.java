import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        while (a.contains(b)) {
            int index = a.indexOf(b);
            
            if (index == 0) {
                a = a.substring(b.length());
            } else if (index == a.length() - b.length()) {
                a = a.substring(0, index);
            } else {
                a = a.substring(0, index) + a.substring(index + b.length());
            }
        }
        
        System.out.print(a);
    }
}