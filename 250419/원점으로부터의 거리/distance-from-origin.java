import java.util.Scanner;
import java.util.Arrays;
class F implements Comparable<F>{
    int a,b,c;
    public F(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int compareTo(F f){
        int d1 = Math.abs(this.a) + Math.abs(this.b);
        int d2 = Math.abs(f.a) + Math.abs(f.b);
        if(d1==d2){
            return this.c-f.c;
        }
        return (d1-d2);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        F[] f = new F[n];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
            f[i]=new F(points[i][0],points[i][1],i+1);
        }
        // Please write your code here.
        Arrays.sort(f);
        for (int i = 0; i < n; i++) {
            System.out.println(f[i].c);
        }
    }
}