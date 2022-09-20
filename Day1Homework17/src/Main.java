public class Main {
    public static void main(String[] args) {
        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;
        for(int i = sayi1-1;i>0;i--) {
            if (sayi1 % i == 0) {
                toplam1 += i;
            }
        }
            for(int i = sayi2-1;i>0;i--) {
                if (sayi2 % i == 0) {
                    toplam2 += i;
                }
            }

        if(toplam1 == sayi2 && toplam2 == sayi1){
            System.out.println(sayi1+" ve "+ sayi2 + " arkadaş sayılardır.");
        }
        else {
            System.out.println("Girilen Sayılar Arkadaş Sayı Değildir.");
        }
    }
}