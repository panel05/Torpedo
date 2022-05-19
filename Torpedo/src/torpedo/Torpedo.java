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

        Jatek();



    }

    
    
    public static void Jatek() {
        jatekosTipp();
        Jatek();

        hajoElhelyez();
        for(int i = 0; i < hajoHely.length; i++) System.out.print(hajoHely[i]);
        TalaltE();
    }
    
    public static int jatekosTipp() {
        int tipp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy egész számot: ");
        tipp = sc.nextInt();
        while(!(tipp>=0 && tipp<=hajoHely.length)){
            System.out.println("Kérek egy egész számot: ");
            tipp = sc.nextInt();
    }
        return tipp;
    }

    public static void TalaltE() {
        int tipp = jatekosTipp();
      if(hajoHely[tipp-1].equals("X")){
          System.out.println("Talált");
          
      }else{
          System.out.println("Nem talált");
      }
      jatekTipp++;
    }
    

}
