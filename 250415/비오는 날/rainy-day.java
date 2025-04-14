import java.util.*;
class Weather{
    String date;
    String to;
    String we;
    public Weather(String date, String to, String we){
        this.date = date;
        this.to = to;
        this.we = we;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] weathers = new Weather[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            weathers[i]= new Weather(date, day, weather);
        }
        Arrays.sort(weathers, new Comparator<Weather>() {
            public int compare(Weather w1, Weather w2) {
                return w1.date.compareTo(w2.date);
            }
        });
        for(int i=0;i<n;i++){
            if((weathers[i].we).equals("Rain")){
                System.out.print(weathers[i].date+" "+weathers[i].to+" "+weathers[i].we);
                break;
            }
        }
    }
}