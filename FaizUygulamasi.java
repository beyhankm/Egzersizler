import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faiz uygulaması
        Kullanıcıdan anapara değerini ve  parasını kaç yıl vadeli yatırmak istediği bilgisini alın ve
        her sene sonunda toplam para miktarını ekrana yazdırın.
        Faiz oranı = %6*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz. Faiz oranı %6");
        int anapara, vade;
        System.out.println("Yatırmak istediğiniz tutar: ");
        anapara = scanner.nextInt();
        System.out.println("Paranızı kaç yıl vadeli yatırmak istiyorsunuz? :");
        vade = scanner.nextInt();
        double toplam_para = anapara;
        double faizOrani = 0.06;
        for (int i = 1; i <= vade; i++) {
            toplam_para = (toplam_para * faizOrani) + toplam_para;
            System.out.println(i + ".yılın sonunda toplam para: " + toplam_para);


        }

    }
}

