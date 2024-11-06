import java.util.Scanner;

public class perkalianMatriks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan ukuran matriks:");
        int n = scanner.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];
        int i, j, k;

        System.out.println("Masukkan elemen-elemen matriks A dan B:");

        // Memasukkan nilai ke matriks A dan B
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = scanner.nextInt();
            }
        }

        // Mengalikan matriks A dan B untuk menghasilkan matriks C
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                C[i][j] = 0;
                for (k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Menampilkan hasil perkalian matriks dalam bentuk matriks
        System.out.println("\nHasil Perkalian Matriks:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("[" + C[i][j] + "]" + "\t" );
            }
            System.out.println();
        }

        scanner.close();
    }
}
