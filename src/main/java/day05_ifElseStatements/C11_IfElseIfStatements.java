package day05_ifElseStatements;

import java.awt.*;
import java.util.Scanner;

public class C11_IfElseIfStatements {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin
        //        sayi 3 ile bolunuyorsa "Uc ile bolunebilen sayi"
        //        5 ile bolunebiliyorsa "Bes ile bolunebilen sayi" yazdirin
        //        Hem 3, hem 5'e bolunuyorsa SUPER yazdirin

        /*
       NOT: coklu if else bloklari
       else ile biterse tum durumlari kapsiyor demektir
       ve her durumda bir if body'si calisir

       Ancak else ile bitmiyorsa
       bu durumda bazi degerler icin kodunuz calisir
       ama hic bir if bodys'si calismayabilir
         */

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");

        int girilenSayi=scanner.nextInt();

        if (girilenSayi%3==0){
            System.out.println("Uc ile bolunebilen sayi");
        } else if (girilenSayi%5==0) {
            System.out.println("Bes ile bolunebilen sayi");
        } else if (girilenSayi%3==0 && girilenSayi%5==0) {
            System.out.println("SUPER");
        }
    }
}
