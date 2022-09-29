import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args){

        Scanner tarayici = new Scanner(System.in);

        System.out.println("Sıcaklık Giriniz");

        double sicaklik = tarayici.nextDouble();

        OdevlerSinifi o = new OdevlerSinifi();

        o.sicaklikDonustur(sicaklik);




    }
}
