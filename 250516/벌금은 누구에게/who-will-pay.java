import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] studentNum = new int [n+1];
        for(int i=1;i<=n;i++){
            studentNum[i] = 0;
        }
        int[] penalizedPerson = new int[m];
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
            studentNum[penalizedPerson[i]]++;
            if(studentNum[penalizedPerson[i]]==k){
                System.out.print(penalizedPerson[i]);
                break;
            }else if(i==m-1){
                System.out.print(-1);
            }
        }
    }
}