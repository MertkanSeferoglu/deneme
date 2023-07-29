package SampleQuestions;

import java.util.Scanner;

public class S06_Cay {
    public static void main(String[] args) {
        // Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        // Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        // 1 şeker = 1.5 gr
        // 1 kg = 1000 gram olarak hesaplayın
        // Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen günde kaç çay içtiğinizi ve kaç şeker attığınızı yazınız");
        int cay = scan.nextInt();
        double seker = scan.nextDouble();
        double sekerKilo = seker * 365 * 1.5 / 1000;
        System.out.println("Yılda: " + cay * 365 + " bardak çay içip " + cay * sekerKilo + " kilogram şeker kullaniyorsunuz");

    }
}
