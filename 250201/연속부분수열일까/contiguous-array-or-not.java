import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr1[] = new int[100];
        int arr2[] = new int[100];
        int count = 0;
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
            for(int j=0;j<n2;j++){
                if(arr2[i]==arr1[j]){
                    count++;
                    break;
                }
            }
        }
        if(count==n2){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
    }
}