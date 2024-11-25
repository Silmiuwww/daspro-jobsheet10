import java.util.Scanner;
public class Tugas12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[10][6];
        double totalKeseluruhan = 0;

        // a. Menyimpan hasil survey
        System.out.println("Masukkan hasil survei (nilai 1-5):");
        for (int i = 0; i < survey.length; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print("  Pertanyaan ke-" + (j + 1) + ": ");
                survey[i][j] = sc.nextInt();
            }
        }

        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("Rata-rata nilai untuk setiap responden:");
        for (int i = 0; i < survey.length; i++) {
            double totalPerResponden = 0;
            for (int j = 0; j < survey[i].length; j++) {
                totalPerResponden += survey[i][j];
            }
            double rataPerResponden = totalPerResponden / survey[i].length;
            System.out.println("  Responden ke-" + (i + 1) + ": " + rataPerResponden);
        }

        // c. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("Rata-rata nilai untuk setiap pertanyaan:");
        for (int j = 0; j < survey[0].length; j++) {
            double totalPerPertanyaan = 0;
            for (int i = 0; i < survey.length; i++) {
                totalPerPertanyaan += survey[i][j];
            }
            double rataPerPertanyaan = totalPerPertanyaan / survey.length;
            System.out.println("  Pertanyaan ke-" + (j + 1) + ": " + rataPerPertanyaan);
        }

        // d. Menampilkan nilai rata-rata secara keseluruhan
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }
        double rataKeseluruhan = totalKeseluruhan / (survey.length * survey[0].length);
        System.out.println("Rata-rata nilai keseluruhan: " + rataKeseluruhan);
   }
}
 