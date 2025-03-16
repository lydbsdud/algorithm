import java.util.Scanner;
public class Main {

    public static boolean in3(int n){
        String st = Integer.toString(n);
        boolean x = false;
        for(char ch:st.toCharArray()){
            if(Character.getNumericValue(ch)==3||Character.getNumericValue(ch)==6||Character.getNumericValue(ch)==9){
                x=true;
            }
        }
        return x;
    }
    public static boolean isMagicNum(int n){
        return n%3==0 || in3(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int count = 0;
        for(int i=A;i<=B;i++){
            if(isMagicNum(i)){
                count++;
            }
        }
        System.out.print(count);
    }
}