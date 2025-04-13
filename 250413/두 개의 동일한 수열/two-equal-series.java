import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        boolean f = true;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        // Please write your code here.
        
        Integer[] numA = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Integer[] numB = Arrays.stream(b).boxed().toArray(Integer[]::new);
        Arrays.sort(numA);
        Arrays.sort(numB);

        for (int i = 0; i < n; i++) {
            if(numA[i]!=numB[i]){
                f = false;
            }
        }
        if(f){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}