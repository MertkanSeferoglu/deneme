package SampleQuestions;

public class S02_DikdortgeninAlani {
    public static void main(String[] args) {
        /*Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
          Ipuclari:
         * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
         * Dikdortgenin Alani : uzun kenar * kisa kenar
         */
        int kisaKenar = 15;
        int uzunKenar = 30;
        System.out.println("Dikdörtgenin çevresi: " + 2 * (uzunKenar + kisaKenar));
        System.out.println("Dikdörtgenin alani: " + (uzunKenar * kisaKenar));


    }
}
