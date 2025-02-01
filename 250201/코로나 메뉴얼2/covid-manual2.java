import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char arrBool[] =new char[3];
        int arrTemp[] = new int[3];
        int arrCount[] = new int[4];
        for(int i=0;i<3;i++){
            arrBool[i] = sc.next().charAt(0);
            arrTemp[i] = sc.nextInt();
            if(arrBool[i]=='Y' && arrTemp[i]>=37){
                arrCount[0]++;
            }else if(arrBool[i]=='N' && arrTemp[i]>=37){
                arrCount[1]++;
            }else if(arrBool[i]=='Y' && arrTemp[i]<37){
                arrCount[2]++;
            }else{
                arrCount[3]++;
            }
        }
        for(int i=0;i<4;i++){
            System.out.print(arrCount[i]+" ");
        }
        if(arrCount[0]>=2){
                System.out.print('E');
            }
    }
}