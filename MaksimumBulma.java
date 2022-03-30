import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        // Kullanıcıdan alınan 3 sayıdan en büyüğünü bulma.
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayı:");
        int sayi1 = scanner.nextInt();
        System.out.println("2.sayı:");
        int sayi2 = scanner.nextInt();
        System.out.println("3.sayı:");
        int sayi3 = scanner.nextInt();

        int maks = -1;  // -1 değer atamasının nedeni--> herhangi bir değer atanabilir. içi boş olunca sıkıntı
                        // yaratabilir.


        if (sayi1>=sayi2 && sayi1>=sayi3) {
            maks = sayi1;
        }
        else if (sayi2>=sayi1 && sayi2>=sayi3){
            maks=sayi2;

            }
        else {
            maks = sayi3;

        }
        System.out.println("Maksimum sayı:" + maks);

    }
}
