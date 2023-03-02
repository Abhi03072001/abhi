
/*import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        int n = 500000;
        for( int i = 1; i<=n; i++) {
            System.out.println(2*i);
        }
        
    }
}*/
import java.util.*;

public class loop {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int marks;
        do {
            marks = sc.nextInt();
            if (marks<=100 && marks>=90) {
                System.out.println("this is good");
            } else if(marks<=89 && marks>=60) {
                System.out.println("this is also good");
            } else if(marks<=59 && marks>=0) {
                System.out.println("this is good as well");
            } else {
                System.out.println("invalid data");
            }
            System.out.println("want to continue yes(1) or no(0)");
            input = sc.nextInt();
        } while(input == 1);
    }
}
