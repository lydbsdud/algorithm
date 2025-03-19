import java.util.Scanner;
public class Main {
    public static boolean isYun(int y){
        if(y%4==0){
            if(y%100==0){
                if(y%400==0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    public static boolean isTrue(int y, int m, int d){
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
            if(d>=1&&d<=31){
                return true;
            }
        }
        if(m==4||m==6||m==9||m==11){
            if(d>=1&&d<=30){
                return true;
            }
        }
        if(m==2){
            if(isYun(y)){
                if(d>=1&&d<=29){
                    return true;
                }
            }
            else{
                if(d>=1&&d<=2){
                    return true;
                }
            }
        }
        return false;
    }
    public static String What(int m){
        if(m>=3&&m<=5){
            return "Spring";
        }
        else if(m>=6&&m<=8){
            return "Summer";
        }
        else if(m>=9&&m<=11){
            return "Fall";
        }    
        return "Winter";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if(isTrue(y,m,d)){
            System.out.print(What(m));
        }
        else{
            System.out.print(-1);
        }

    }
}