import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> l = new LinkedList<>();
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            l.add(s.charAt(i));
        }
        
        // 커서를 맨 뒤에 위치시킴
        ListIterator<Character> it = l.listIterator(l.size()); 
        
        for (int i = 0; i < m; i++) {
            char command = sc.next().charAt(0);
            
            if (command == 'L') {
                if (it.hasPrevious()) {
                    it.previous();
                }
            } else if (command == 'R') {
                if (it.hasNext()) {
                    it.next();
                }
            } else if (command == 'D') {
                // [수정됨] 커서 뒤(오른쪽)에 있는 문자를 제거
                if (it.hasNext()) {
                    it.next();   // 오른쪽 문자를 건너가서
                    it.remove(); // 그 문자를 제거 (iterator는 다시 원래 위치로 돌아오는 효과)
                }
            } else if (command == 'P') {
                char x = sc.next().charAt(0);
                it.add(x);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (Character c : l) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}