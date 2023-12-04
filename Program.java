import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner bv = new Scanner(System.in);
        int baris;
        int kolom;
        String[][] br = new String[4][8];
        String nama;
        String next ;
        

        do {
            System.out.println("pilih menu \n 1. pilih nomor tempat parkir\n 2. denah \n 3. exit");
            String menu = bv.nextLine();

            if (menu.equalsIgnoreCase("1")) {
                System.out.println("masukkan nama anda");
                nama = bv.nextLine();
                System.out.println("masukkan baris tempat parkir yang ingin anda pilih");
                baris = bv.nextInt();
                System.out.println("masukkan kolom tempat parkir yang anda pilih");
                kolom = bv.nextInt();
                bv.nextLine(); 

                if (br[baris - 1][kolom - 1] != null) {
                    System.out.println("warning!! tempat duduk telah terisi, silahkan masukkan tempat duduk anda kembali");
                } else {
                    br[baris - 1][kolom - 1] = nama;
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = bv.nextLine();
                    if (next.equalsIgnoreCase("N")) {
                        continue;
                    }
                }
            } else if (menu.equalsIgnoreCase("2")) {
                System.out.println("denah :");
                for (int i = 0; i < br.length; i++) {
                    for (int j = 0; j < br[i].length; j++) {
                        if (br[i][j] == null) {
                            System.out.print("[]");
                        } else {
                            System.out.print("X");
                        }
                    }
                    System.out.println();
                }
            } else if (menu.equalsIgnoreCase("3")) {
                break;
            } else {
                System.out.println("Pilihan anda tidak valid");
            }
        } while (true);

    }
}
