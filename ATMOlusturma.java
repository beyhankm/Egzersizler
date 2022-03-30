import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int bakiye=1000;

        String islemler="1. işlem: Bakiye sorgulama\n" +
                "2. işlem: Para çekme\n" +
                "3. işlem: Para yatırma\n" +
                "Çıkış: q";

        System.out.println("********************");
        System.out.println(islemler);
        System.out.println("********************");



        while (true){
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            String islem=scanner.nextLine();
            if (islem.equals("1")){
                System.out.println("Bakiyeniz: " + bakiye);

            }
            else if (islem.equals("2")){
                System.out.println("Lütfen çekmek istediğiniz tutarı giriniz: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                bakiye-=tutar;
                if (bakiye<0){
                    System.out.println("Yeterli Bakiyeniz yoktur.");
                }
                else {
                    System.out.println("Güncel bakiyeniz: " + bakiye);
                }

            }
            else if (islem.equals("3")){
                System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                System.out.println("Güncel bakiyeniz: " + bakiye);

            }
            else{
                System.out.println("Çıkışınız yapılıyor.");
            break;
            }




        }

    }
}
