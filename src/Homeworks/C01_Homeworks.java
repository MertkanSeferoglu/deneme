package Homeworks;

public class C01_Homeworks {
    public static void main(String[] args) {
        //Dairenin alani ve Dairenin cevresi
        int r = 7;
        double Pi = 3.14;
        double daireninCevresi = 2 * r * Pi;
        double daireninAlani = Pi * r * r;
        System.out.println("Dairenin Cevresi: " + daireninCevresi);
        System.out.println("Dairenin Alani: " + daireninAlani);

        //Dikdortgenin alani ve Dikdörtgenin cevresi
        double kisaKenar = 10.21;
        double uzunKenar = 20.42;
        double dikdortgeninCevresi = 2 * (uzunKenar + kisaKenar);
        double dikdortgeninAlani = uzunKenar * kisaKenar;
        System.out.println("Dikdortgenin Cevresi: " + dikdortgeninCevresi);
        System.out.println("Dikdortgenin Alani: " + dikdortgeninAlani);

    }
}
