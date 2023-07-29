package Homeworks;

import java.util.Scanner;

public class C02_Homeworks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Soru 1 : Kullanicidan bir cumle alin
        //          - cumlede ev geciyorsa, "home home sweet home" yazdirin
        //          - cumlede is geciyorsa, "calismak guzeldir"
        //          - ikisini de iceriyorsa "Hem ev lazim hem is"
        //          - hicbirini icermiyorsa "cok calisman lazim" yazdirin
        System.out.println("Lütfen bir cümle giriniz");
        String cumle =scan.nextLine();
        if (cumle.contains("ev") && cumle.contains("is")) {
            System.out.println("Hem ev lazim hem is");
        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");
        } else if (cumle.contains("ev")){
            System.out.println("home home sweet home");
        } else
            System.out.println("cok calisman lazim");

    }
}
