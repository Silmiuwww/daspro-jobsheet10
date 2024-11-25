import java.util.Scanner;

public class ModifBioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama;
        int baris, kolom;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 
            if (pilihan == 1) {

                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris (1-4): ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom (1-2): ");
                kolom = sc.nextInt();
                sc.nextLine(); 

                if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi sudah terisi, pilih kursi lain.");
                    continue;
                } if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Baris atau kolom tidak valid. Coba lagi.");
                } else {
                 
                    penonton[baris - 1][kolom - 1] = nama;
                }
            } else if (pilihan == 2) {
        
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                      
                        System.out.print((penonton[i][j] != null ? penonton[i][j] : "***") + "\t");
                    }
                    System.out.println();
                }
            } else if (pilihan == 3) {
              
                System.out.println("Terima kasih!");
                break;
            } else {
               
                System.out.println("Pilihan tidak valid!");
            }
        }
    }
}


