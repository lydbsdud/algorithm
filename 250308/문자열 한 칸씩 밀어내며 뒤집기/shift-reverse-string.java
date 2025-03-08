import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int len = st.length();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (k == 1) {
                st = st.substring(1) + st.charAt(0); // 왼쪽으로 한 칸 회전
            } else if (k == 2) {
                st = st.charAt(len - 1) + st.substring(0, len - 1); // 오른쪽으로 한 칸 회전
            } else if (k == 3) {
                st = new StringBuilder(st).reverse().toString(); // 문자열 뒤집기
            }
            System.out.println(st);
        }
        
        sc.close(); 
    }
}
