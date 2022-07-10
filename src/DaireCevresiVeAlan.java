import java.sql.SQLOutput;
import java.util.Scanner;
public class DaireCevresiVeAlan {
    public static void main(String[] args) {
        double r, diliminAlanı, alan, cevre, alfa, pi = 3.1415;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = girdi.nextDouble();

        System.out.print("Dairenin Merkez Açısının Ölçüsünü Giriniz: ");
        alfa = girdi.nextDouble();

        diliminAlanı = (pi * (r*r) * alfa) / 360;
        alan = r * r * pi;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Yarıçapı: " + r );
        System.out.println("Dairenin Çapı: " +(2 * r));
        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: "+ cevre);
        System.out.println("Daire Diliminin Alanı: " + diliminAlanı);
    }
}
