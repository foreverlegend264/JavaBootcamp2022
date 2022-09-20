import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Character[] harfler = new Character[10];
        String kelime = " Yağmur  ";
        System.out.println(kelime.length());
        System.out.println(kelime.concat("Yağıyor"));
        System.out.println(kelime.startsWith(" "));
        System.out.println(kelime.endsWith("."));
        System.out.println(kelime.charAt(4));
        System.out.println(kelime.indexOf('ğ'));
        System.out.println(kelime.lastIndexOf('m'));
        System.out.println(kelime.replace('ğ','l'));
        System.out.println(kelime.substring(2));
        System.out.println(kelime.substring(2,5));

        for(String k:kelime.split("m")) {
            System.out.println(k);
        }
        System.out.println(kelime.toLowerCase());
        System.out.println(kelime.toUpperCase());
        System.out.println(kelime.trim());

    }
}