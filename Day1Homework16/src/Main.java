public class Main {
    public static void main(String[] args) {
        int sayi = 15;
        int toplam=0;
        for(int i=sayi-1;i>0;i--){
            if(sayi%i ==0){
                toplam +=i;
            }
        }
        if(toplam == sayi){
            System.out.println("Girilen Sayı Mükemmel Sayıdır : "+ sayi);
        }
        else {
            System.out.println("Girilen Sayı Mükemmel Sayı Değildir : "+ sayi);
        }
    }
}