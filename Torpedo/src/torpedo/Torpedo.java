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

    // MAIN
    public static void main(String[] args) {
        while(!jatekosNyert()) Jatek();
        System.out.println("Próbálkozások száma: " + jatekTipp);
    }
    
    public static void Jatek() {
        hajoElhelyez();
        for(int i = 0; i < hajoHely.length; i++) System.out.print(hajoHely[i]);
        TalaltE();
    }
    
    public static int jatekosTipp() {
        int tipp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy egész számot: ");
        tipp = sc.nextInt();
        return tipp;
    }

    public static void TalaltE() {
        int tipp = jatekosTipp();
      if(hajoHely[tipp - 1].equals("X")){
          System.out.println("Talált");
          hajoHely[tipp - 1] = "_";
          
      }else{
          System.out.println("Nem talált");
        }
      jatekTipp++;
    }

    public static boolean jatekosNyert() {
        int k = 0;
        while(k < hajoHely.length && !hajoHely[k].equals("X")) k++;
        boolean nyert = k < hajoHely.length;
        return nyert;
    }
    
}