// bufferreader code

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dsa03 {
    public static void main(String[] args) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in); 
        BufferedReader bf = new BufferedReader(is);
        System.out.println("give a string");
        String s = bf.readLine();
        int a = Integer.parseInt(bf.readLine());
        bf.close();
        System.out.println(s);
        System.out.println(a);
    
        

    }
}
