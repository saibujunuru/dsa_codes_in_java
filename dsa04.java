
import java.util.Scanner;
public class dsa04 {

    public static void main(String[] arg){

        System.out.println("give a character");
        Scanner sc  = new Scanner(System.in);
       char ch;
       ch= sc.nextLine().charAt(0);
       sc.close();
       if(ch >=65 && ch<=90){
           System.out.println("1");
       }else if(ch>=97 && ch<=122){
          System.out.println("0");

       }else{
         System.out.println("-1");
       }

        
    }
    
}
