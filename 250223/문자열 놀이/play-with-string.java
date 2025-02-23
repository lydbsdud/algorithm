import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int n = sc.nextInt();
        char[] arr = st.toCharArray();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(x==1){
                int a = sc.nextInt()-1;
                int b = sc.nextInt()-1;
                char c = arr[b];
                arr[b]=arr[a];
                arr[a]=c;
                for(int k=0;k<st.length();k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
            if(x==2){
                char q = sc.next().charAt(0);
                char y = sc.next().charAt(0);
                for(int t=0;t<st.length();t++){
                    if(arr[t]==q){
                        arr[t]=y;
                    }
                }
                for(int k=0;k<st.length();k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
}