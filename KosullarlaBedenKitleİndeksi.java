import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /* Kullanıcıdan alınan boy ve kilo değerlerine göre beden kitle indeksini hesaplayın.
           Ve şu kurallara göre yazdırınız.
           Beden Kitle İndeksi: Kilo (KG) / Boy(m) * Boy(m)
           BKİ 18.5'un altındaysa -----> Zayıf
           BKİ 18.5 ile 25 arasındaysa -----> Normal
           BKİ 25 ile 30 arasındaysa -----> Fazla Kilolu
           BKİ 30un üstündeyse -----------> Obez
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz: ");
        int kilo = scanner.nextInt();
        System.out.println("Lütfen boyunuzu giriniz: ");
        double boy= scanner.nextDouble();
        double bki = kilo/(boy*boy);
        System.out.println("Beden Kitle İndeksi: " + bki);


        if (bki<=18.5){
            System.out.println("Zayıf");
        }
        else if (bki<=25){
            System.out.println("Normal");
        }
        else if (bki<=30){
            System.out.println("Fazla Kilolu");
        }
        else {
            System.out.println("Obez");
        }


    }
}
