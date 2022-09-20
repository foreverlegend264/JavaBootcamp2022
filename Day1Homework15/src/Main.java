public class Main {
    public static void main(String[] args) {
        char harf = 'E';
        switch (harf){
            case('A'):
            case('O'):
            case('U'):
            case('I'):
                System.out.println("Kalın Ünlü Harf.");
                break;
            default:
                System.out.println("İnce Ünlü Harf.");
        }
    }
}