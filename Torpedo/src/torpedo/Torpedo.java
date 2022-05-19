package torpedo;

import java.util.*;

public class Torpedo {
    private static int jatekTipp = 0;
    private static String[] hajoHely = new String[7];
    
    private static Random r = new Random();

    public static void hajoElhelyez() {
        String hajoForma = "X";
        for(int i = 0; i < hajoHely.length; i++) hajoHely[i] = "_";

        int randomElhelyez = r.nextInt(hajoHely.length);
        // int randomElhelyez = 5;
        hajoHely[randomElhelyez] = hajoForma;

        if(randomElhelyez == hajoHely.length - 1 || randomElhelyez == hajoHely.length - 2) {
            for(int j = 1; j < 3; j++) hajoHely[randomElhelyez - j] = hajoForma;
        }
        else {
            for(int j = 1; j < 3; j++) hajoHely[randomElhelyez + j] = hajoForma;
        }
    }

    public static void main(String[] args) {
        hajoElhelyez();
        for(int i = 0; i < hajoHely.length; i++) System.out.print(hajoHely[i]);


    }
}
