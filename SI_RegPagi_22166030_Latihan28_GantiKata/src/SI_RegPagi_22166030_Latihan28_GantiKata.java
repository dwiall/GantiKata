import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi
 * NIM      : 22166030
 * Deskripsi program : Pembuatan program mengganti kata dalam sebuah kalimat, dimana user menginputkan sendiri kalimatnya.
 */
public class SI_RegPagi_22166030_Latihan28_GantiKata {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("========Program Mengganti Kata========");
            System.out.println("\n");
            
            //Variabel
            String kalimat, kataLama, kataBaru;
            
            // Meminta pengguna memasukkan kalimat
            System.out.print("Masukkan Kalimat \t: ");
            kalimat = input.nextLine();
            
            // Meminta kata yang akan diganti
            System.out.print("Ganti Kata \t\t: ");
            kataLama = input.nextLine();
            
            // Meminta kata pengganti
            System.out.print("Menjadi Kata\t\t: ");
            kataBaru = input.nextLine();
            
            System.out.println("\n");
            
            // Mengganti kata dalam kalimat
            String kalimatBaru = kalimat.replaceAll(kataLama, kataBaru);
            
            // Menampilkan hasil formatting
            System.out.println("========Hasil Formatting========");
            System.out.println("\n");
            System.out.println("Kalimat awal : " + kalimat);
            System.out.println("Kalimat baru : " + kalimatBaru);
        }
    }
    
}
