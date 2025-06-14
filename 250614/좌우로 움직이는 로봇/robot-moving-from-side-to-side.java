import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int [1000001];
        int[] b = new int [1000001];
        int aT = 0;
        int aL = 0;
        int bT = 0;
        int bL = 0; 
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            if(d=='R'){
                for(int j = aT+1;j<=aT+t;j++){
                    aL++;
                    a[j]=aL;
                }
                aT+=t;
            }else if(d=='L'){
                for(int j = aT+1;j<=aT+t;j++){
                    aL--;
                    a[j]=aL;
                }
                aT+=t;
            }
        }
        
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            if(d=='R'){
                for(int j =bT+1;j<=bT+t;j++){
                    bL++;
                    b[j]=bL;
                }
                bT+=t;
            }else if(d=='L'){
                for(int j = bT+1;j<=bT+t;j++){
                    bL--;
                    b[j]=bL;
                }
                bT+=t;
            }
        }
        if(aT>bT){
            for(int i=bT+1;i<=aT;i++){
                b[i]=b[bT];
            }
        }else if(aT<bT){
            for(int i=aT+1;i<=bT;i++){
                a[i]=a[aT];
            }
        }
        int t = Math.max(aT,bT);
        int count = 0;
        for(int i=1;i<=t;i++){
            if((a[i-1]!=b[i-1])&&(a[i]==b[i])){
                count++;
            }
        }
        System.out.print(count);
    }
}