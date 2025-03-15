import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            int a = sc.nextInt();
            if(a==1){
                int b = sc.nextInt();
                System.out.println(arr[b-1]);
            }
            else if(a==2){
                int b = sc.nextInt();
                int index = 0 ;
                for(int t=0;t<n;t++){
                    if(arr[t]==b){
                        index=t+1;
                        break;
                    }
                }
                System.out.println(index);
            }
            else if(a==3){
                int b = sc.nextInt();
                int c = sc.nextInt();
                for(int t=b-1;t<c;t++){
                    System.out.print(arr[t]+" ");
                }
                System.out.println();
            }
        
        }
    }
}