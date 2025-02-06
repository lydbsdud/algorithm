import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<2;i++){
            String st = sc.nextLine();
            for(int j=0;j<st.length();j++){
                if(st.charAt(j)!=' '){
                    System.out.print(st.charAt(j));
                }
            }
        }

    }
}