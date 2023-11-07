
package pemdas;

import java.util.Scanner;

public class VolumeBalok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang balok: ");
        double panjang = scanner.nextDouble();

        System.out.println("Masukkan lebar balok: ");
        double lebar = scanner.nextDouble();

        System.out.println("Masukkan tinggi balok: ");
        double tinggi = scanner.nextDouble();

        double volume = panjang * lebar * tinggi;
        System.out.println("Volume balok adalah: " + volume);
    }
}
