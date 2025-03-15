import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        String st = Integer.toString(a+b);
        for(char ch: st.toCharArray()){
            if(Character.getNumericValue(ch)==1){
                count++;
            }
        }
        System.out.print(count);
    }
}