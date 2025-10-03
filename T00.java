import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, jumlah, kali;

        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        if (a % 2 == 0) {
            System.out.println("Bilangan pertama Genap");
            if (b % 2 == 0) {
                System.out.println("Bilangan pertama Genap");
            } else {
                System.out.println("Bilangan kedua Ganjil");
            }
        } else {
            System.out.println("Bilangan kedua Ganjil");
        }
        if (a > b) {
            System.out.println("bilangan pertama lebih besar");
        } else {
            if (a == b) {
                System.out.println(" Kedua Bilangan sama besar ");
            } else {
                System.out.println("Bilangan Kedua lebih besar");
            }
        }
        if (a % 2 == 0 && b % 2 == 0) {
            jumlah = a + b;
            System.out.println("Hasil penjumlahan " + jumlah);
        } else {
            if (a % 2 == 1 && b % 2 == 1) {
                kali = a * b;
                System.out.println("Hasil perkalian " + kali);
            } else {
                System.out.println(" Berbeda jenis");
            }
        }
    }
}
