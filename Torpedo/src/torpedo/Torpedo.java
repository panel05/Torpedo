package torpedo;

import java.util.*;

public class Torpedo {

    

    

    
    private int jatekTipp = 0;
    private String[] hajoHely;
    public static void main(String[] args) {
        Jatek();
        
    }
    
    
    public static void Jatek() {
        jatekosTipp();
    }
    
    public static int jatekosTipp() {
        int tipp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy egész számot: ");
        tipp = sc.nextInt();
        return tipp;
    }
    
}
