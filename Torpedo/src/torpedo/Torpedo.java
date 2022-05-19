package torpedo;

import java.util.*;

public class Torpedo {

    

    
    private int jatekTipp = 0;
    private String[] hajoHely;
    public static void main(String[] args) {
        jatekosTipp();
    }
    
    public static void jatekosTipp() {
        int tipp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy egész számot: ");
        tipp = sc.nextInt();
        System.out.println(tipp);
    }
}
