package torpedo;

import java.util.*;

public class Torpedo {

    private static int jatekTipp = 0;
    private static String[] hajoHely = new String[7];
    
    private static Random r = new Random();

    public static void hajoElhelyez() {
        String hajoForma = "X";
        for(int i = 0; i < hajoHely.length; i++) hajoHely[i] = " ";
    }


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
