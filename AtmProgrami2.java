import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /*
        While döngüsü yardımıyla bir tane ATM programı yazın.

        İşlemler
        1. işlem : Bakiye sorgulama
        2. işlem : Para çekme
        3. işlem : Para yatırma
        Çıkış
         */


        Scanner scanner = new Scanner(System.in);
        int bakiye= 1000;

        String islemler= "1. işlem : Bakiye öğrenme\n" +
                "2.işlem : Para çekme\n" +
                "3.işlem : Para yatırma\n" +
                "Çıkış için q'a basın";

        System.out.println("*******************");
        System.out.println(islemler);
        System.out.println("*******************");

        while (true){
            System.out.println("İşlemi seçiniz: ");
            String islem= scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor.");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeniz: " + bakiye);
            }
            else if (islem.equals("2")){
                System.out.println("Çekmek istediğiniz tutar: ");
                int tutar= scanner.nextInt();
                scanner.nextLine();

                if (bakiye-tutar<0){
                    System.out.println("Yeterli bakiyeniz yok. Bakiye: " + bakiye);

                }
                else {
                    bakiye-=tutar;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                }
            }
            else if(islem.equals("3")){
                System.out.println("Yatırmak istediğiniz tutar:");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni bakiyeniz: " + bakiye);
            }
            else {
                System.out.println("Geçersiz İşlem..");

            }

        }





    }

}
