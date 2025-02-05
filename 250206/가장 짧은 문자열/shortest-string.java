import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 20;
        for(int i=0;i<3;i++){
            String st = sc.next();
            if(st.length()>max){
                max=st.length();
            }
            if(st.length()<min){
                min=st.length();
            }
        }
        System.out.print(max-min);
    }
}