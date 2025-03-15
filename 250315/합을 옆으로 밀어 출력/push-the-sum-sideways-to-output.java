import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            sum+=x;
        }
        String st = Integer.toString(sum);
        st = st.substring(1)+st.charAt(0);
        System.out.print(st);
    }
}