package com.company;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

public class Tierheim2 {
    public static void main(String[] args) {
        System.out.println("Wilkommen im glücklichen Tierheim!");
        // Hund Lessie - 20 kg - spielfreudig, löst Kriminalfälle

    // Wie weit geht er heute spazieren?
        double spazierlaenge = wieWeitSpazieren(15, 16, false);
        System.out.println("Dieser Hund geht heute " + spazierlaenge + "km spazieren.");



    //Abfrage kuschelBedarf
        // int [] kuschelZeit = new int[3];
        // kuschelZeit[0] = 25;
        // kuschelZeit[1] = 15;
        // kuschelZeit[2]


        // double futterLessie;
    double futterLessie;
        double ge = 20;
        futterLessie = berechneFuttermenge(ge);
        System.out.println("Lessie bekommt " + futterLessie + " kg Futter");
        // Unterschiedliche Varianten um das Gewicht um 1 kg zu erhoehen
        double x;
        x = ge++;
        System.out.println(x + " " + ge);
        // ge = ge + 1;
        // ge += 1;
        // ge++; ++ge;

        // fuettern am Abend
        futterLessie = berechneFuttermenge(ge);
        System.out.println("Lessie bekommt am Abend " + futterLessie + " kg Futter");
    }
    public static double berechneFuttermenge(double gewicht){
        double futterMenge;

        futterMenge = gewicht / 20;

        return futterMenge;
        // ganz kurz geschrieben
        // return gewicht / 20;
    }
    // Beispiel 3a
    public static double wieWeitSpazieren (double gewicht, int letztesMal, boolean vertraegtSich) {
    double ergebnis;


        if (gewicht < 1 && !vertraegtSich){
            ergebnis = 2;
        }
        else if (gewicht < 1 && vertraegtSich){
            ergebnis = 4;
        }
        else if (gewicht > 15 || letztesMal > 24 && vertraegtSich) {
            ergebnis = 8;
        }

        else {
            ergebnis = 5;
        }

        return  ergebnis;


       // public static boolean kuschelBedarf (int[] kuschelZeit) {
       // boolean bedarf;


        //eturn bedarf;
    }
}

