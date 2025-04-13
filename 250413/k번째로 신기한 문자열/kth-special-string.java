import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        int count = 0;
        int idx = 0;
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            if(words[i].indexOf(t)==0){
                idx = i;
                count++;
            }
        }
        Arrays.sort(words, idx-count, idx+1);
        System.out.print(words[idx-count+k-1]);
    
    }
}