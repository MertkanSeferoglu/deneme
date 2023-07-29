package Homeworks;

import java.util.Scanner;

public class C03_HomeWorks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //         sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        //          input : java1 ogRe2@nMek3 #ne +Gu=zel
        //          output : Java ogrenmek ne guzel.
        System.out.println("metin giriniz");
        String str= scan.nextLine();
        str=str.replaceAll("\\s","1");
        str=str.replaceAll("\\W","");
        str=str.replaceAll("1"," ");
        str=str.replaceAll("\\d","");
        str=str.replaceFirst("j","J");
        str=str.replaceFirst("M","m");
        str=str.replaceFirst("R","r");
        str=str.replaceFirst("G","g");
        System.out.println(str);

    }
}
