package SampleQuestions;

import java.util.Scanner;

public class S05_KareAlanCevre {
    public static void main(String[] args) {
        //Kullanıcıdan karenin kenar uzunluğunu alın.
        // Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen karenin kenarini giriniz");
        int kenar = scan.nextInt();
        System.out.println("Girdiginiz karenin bir kenar uzunluğu: " + kenar +
                "\nÇevre uzunluğu: " + (kenar * 4) + "\nAlani: " + (kenar * kenar));
    }
}
