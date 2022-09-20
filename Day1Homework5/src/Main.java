public class Main {
    public static void main(String[] args) {
        String durum = "Fırtına";
        switch (durum){
            case "Güneşli":
                System.out.println("Hava güzel.");
                break;
            case "Yağmurlu":
                System.out.println("Şemsiye al.");
                break;
            case "Fırtına":
                System.out.println("Dışarı Çıkma.");
                break;
            case "Dolu":
                System.out.println("Şemsiye Al.");
                break;
        }
    }
}