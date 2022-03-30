import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //while döngüsü yardımıyla bir kullanıcı girişi yazmaya çalışın.

        Scanner scanner = new Scanner(System.in);
        int giris_hakki=3;

        String sys_kullanici_adi="Beyhankm";
        String sys_parola= "663720";

        System.out.println("*************************");
        System.out.println("Kullanıcı girişine hoşgeldiniz....");
        System.out.println("*************************");

        while (true){
            System.out.println("Kullanıcı Adı: ");
            String kullanici=scanner.nextLine();
            System.out.println("Parola: ");
            String parola= scanner.nextLine();
            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Girişiniz yapılıyor.");
                break;
            }
            else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                System.out.println("Parolanız yanlış. Lütfen tekrar deneyiniz.");
                giris_hakki-=1;
                System.out.println("Giriş hakkı: " + giris_hakki);
            }
            else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Kullanıcı adınız yanlış. Lütfen tekrar deneyiniz.");
                giris_hakki-=1;
                System.out.println("Giriş hakkı: " + giris_hakki);
            }
            else {
                System.out.println("Kullanıcı adı ve parola yanlış. Lütfen tekrar deneyiniz.");
                giris_hakki-=1;
                System.out.println("Giriş hakkı: " + giris_hakki);
            }
            if (giris_hakki==0){
                System.out.println("Giriş hakkınız bitti. Sistemden çıkılıyor. Lütfen daha sonra tekrar deneyiniz.");
                break;
            }
        }
    }
}
