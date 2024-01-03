// to take user input from console using scanner class
import java.util.Scanner;

public class dsa02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
         System.out.println("give line");
        String A = sc.next();
        int B = sc.nextInt();

        sc.close();
       
        System.out.println(A);
        System.out.println(B);
    }

    
}
