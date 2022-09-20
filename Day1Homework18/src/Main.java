public class Main {
    public static void main(String[] args) {
        int arananSayi = 9;
        boolean varMi=false;
        Integer[] liste = {1, 5, 3, 8, 4, 3};
        for(int eleman: liste){
            if(eleman == arananSayi){
                varMi = true;
            }
        }
        if(varMi){
            System.out.println("Aranan Sayı Listenin İçinde Vardır.");
        }
        else {
            System.out.println("Aranan Sayı Listede Yok.");
        }
    }
}