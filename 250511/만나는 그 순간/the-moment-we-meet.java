import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int time = 0;
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = W(n);
        int[] y = W(m);
        for(int i=1;i<=time;i++){
            if(x[i]==y[i]){
                System.out.print(i);
                break;
            }
            if(i==time){
                System.out.print(-1);
            }
        }
        
    }
    public static int[] W(int n){
        int[] arr = new int[1000000];
        time = 0;
        int where = 0;
        for(int i=0;i<n;i++){
            char q = sc.next().charAt(0);
            int w = sc.nextInt();
            if(q=='R'){
                for(int j=time+1;j<=time+w;j++){
                    where++;
                    arr[j] = where;
                }
                time+=w;
            }
            else if(q=='L'){
                for(int j=time+1;j<=time+w;j++){
                    where--;
                    arr[j] = where;
                }
                time+=w;
            }
        }
        return arr;
    }
}