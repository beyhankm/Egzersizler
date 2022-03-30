import java.util.Scanner;

public class Test2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1. Sayıyı Giriniz: ");
        int sayi1= scanner.nextInt();
        System.out.println("Lütfen 2. Sayıyı Giriniz: ");
        int sayi2= scanner.nextInt();
        System.out.println("1.sayı: " + sayi1 +" <--> "+ "2.sayı " + sayi2);
        int a=sayi1;
        sayi1=sayi2;
        sayi2=a;
        //System.out.println("change: "+sayi2);
        System.out.println(sayi1+  " "+ sayi2);





    }
}
