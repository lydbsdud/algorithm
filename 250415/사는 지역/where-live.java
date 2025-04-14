import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class User {
    String name;
    String address;
    String city;
    public User(String name, String address, String city){
        this.name = name;
        this.address = address;
        this.city = city;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        User[] users = new User[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
            users[i]=new User(names[i],addresses[i],regions[i]);
        }
        Arrays.sort(names,Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if(names[0].equals(users[i].name)){
                System.out.println("name "+ users[i].name);
                System.out.println("addr "+ users[i].address);
                System.out.println("city "+ users[i].city);
                break;
            }
        }

    }
}