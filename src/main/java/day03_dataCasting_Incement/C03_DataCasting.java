package day03_dataCasting_Incement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        char ch1= 'a';
        char ch2= 'b';

        System.out.println(ch1+ch2);

        //char data turundeki variable'lar
        //matematiksel islemlerde kullanilirse
        //ascii tablosundaki degerleri ise isleme girerler

        //kullanicidan bir karakter alin
        //ascii tablosuna gore o karakterden sonraki 3 karakteri yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen  bir karakter giriniz");
        char girilenChr= scanner.next().charAt(0);

        System.out.println("Girilen karakterden sonraki 3 karakter : "+ (char)(girilenChr+1) + ","+(char)(girilenChr+2)+","+ (char)(girilenChr+3));

    }
}
