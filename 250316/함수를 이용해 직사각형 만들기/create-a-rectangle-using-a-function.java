import java.util.Scanner;

public class Main {
    public static void square(int rowNum, int colNum){
        for(int i=0;i<rowNum;i++){
            for(int t=0;t<colNum;t++){
                System.out.print(1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();
        // Please write your code here.
        square(rowNum,colNum);
    }
}