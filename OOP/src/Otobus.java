public class Otobus {

    int kapasite;
    int mevcutYolcu;
    String nereden;
    String nereye;



    public void bilgiAl(){

        System.out.println("kapasite    :"+kapasite);
        System.out.println("mevcutYolcu :"+mevcutYolcu);
        System.out.println("nereden     :"+nereden);
        System.out.println("nereye      :"+nereye);
    }


    public void yolcuAl(int yolcuMiktari){

        mevcutYolcu = mevcutYolcu +yolcuMiktari;

        if (mevcutYolcu>kapasite){
            System.out.println("Otobüs Dolu");
        }else{
            System.out.println("Yolcu Sayısı  "+ mevcutYolcu);
        }
    }


    public void yolcuIndir(int yolcuMiktari){
        mevcutYolcu = mevcutYolcu -yolcuMiktari;
        if (mevcutYolcu ==0){
            System.out.println("Otobüs Boş");
        }else{
            System.out.println("Yolcu Sayısı   "+mevcutYolcu);
        }
    }
}
