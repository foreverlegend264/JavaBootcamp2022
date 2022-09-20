public class Main {
    public static void main(String[] args) {
        double toplam =0;
        double[] sayilar = {1.8,4.1,2.4,6.7,8.5,4.2,9.4,6.9};
        double enBuyukSayi=sayilar[0];
        for(double sayi : sayilar){
            toplam += sayi;
            if(enBuyukSayi<sayi){
                enBuyukSayi = sayi;
            }
        }
        System.out.println("Dizideki Sayıların Toplamı : "+toplam);
        System.out.println("Dizideki En Büyük Sayı : "+ enBuyukSayi);
    }
}