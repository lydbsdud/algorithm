import java.util.Scanner;
import java.util.Arrays;
class F implements Comparable<F>{
    int a,b;
    public F (int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public int compareTo(F f){
        if(f.a==this.a){
            return this.b-f.b;
        }
        return this.a-f.a;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] k = new int[n];
        F[] f = new F[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            f[i]= new F(arr[i],i+1);
        }
        // Please write your code here.
        Arrays.sort(f);
        for(int i=0;i<n;i++){
            for(int t=0;t<n;t++){
                if((f[i].a==arr[t])&& f[i].b-1==t){
                    k[t]=i+1;
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(k[i]+" ");
        }
    }
}