import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(char ch: st.toCharArray()){
            if(Character.isLetter(ch)){
                result.append(Character.toUpperCase(ch));
            }           
        }
        System.out.print(result);
        
    }
}