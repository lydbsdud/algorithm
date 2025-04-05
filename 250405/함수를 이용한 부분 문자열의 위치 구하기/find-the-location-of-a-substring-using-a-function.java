import java.util.Scanner;
public class Main {
    public static int index(String text, String pattern){
        if(text.contains(pattern)){
            return text.indexOf(pattern);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.
        System.out.print(index(text,pattern));
    }
}