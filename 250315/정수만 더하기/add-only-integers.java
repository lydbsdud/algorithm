import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int result = 0;
        for(char ch: st.toCharArray()){
            if(Character.isDigit(ch)){
                result+=Character.getNumericValue(ch);
            }
        }
        System.out.print(result);
    }
}