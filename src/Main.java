import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double ArmutK,ElmaK,DomatesK,MuzK,PatlicanK,ToplamFiyat;

        Scanner input=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo:");
        ArmutK=input.nextDouble();

        System.out.print("Elma Kaç Kilo:");
        ElmaK=input.nextDouble();

        System.out.print("Domates Kaç Kilo:");
        DomatesK=input.nextDouble();

        System.out.print("Muz Kaç Kilo:");
        MuzK=input.nextDouble();

        System.out.print("Patlican Kaç Kilo:");
        PatlicanK=input.nextDouble();

        ToplamFiyat=ArmutK*2.14+ElmaK*3.67+DomatesK*1.11+MuzK*0.95+PatlicanK*5;

        System.out.println("Toplam Alışveriş Tutarı:"+ToplamFiyat+" TL");


        System.out.println("İyi Alışverişler Dileriz. Yine Bekleriz.");
    }
}