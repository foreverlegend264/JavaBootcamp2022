public class Main {
    public static void main(String[] args) {
        int sayi = 25;
        int bolenSayisi=0;
        if(sayi<0){
            System.out.println("Lütfen 0'dan Büyük Bir Sayı Giriniz.");
        }

        else{

        for(int i=2;i<sayi;i++){
            if(sayi % i == 0){
                bolenSayisi++;
                break;
            }
        }
        if(bolenSayisi !=0){
            System.out.println(false);
        }
        else{
            System.out.println(true);
            }
        }
    }
}