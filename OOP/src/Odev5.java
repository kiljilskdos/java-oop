import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args){

        Scanner tarayici = new Scanner(System.in);
        System.out.println("Kenar Sayısı Giriniz");
        int kenarSayisi = tarayici.nextInt();


        OdevlerSinifi o = new OdevlerSinifi();
        int sonuc = o.icAciToplami(kenarSayisi);


        System.out.println("İç Açı Toplamı  :" +sonuc);
    }
}
