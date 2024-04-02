import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner pilihan = new Scanner(System.in);
        Scanner nim = new Scanner(System.in);
        System.out.print("\n==== Library System ====");
        System.out.print("\n1. Login as student");
        System.out.print("\n2. Login as admin");
        System.out.print("\n3. Exit\n");
        System.out.print("Choose option (1-3): ");
        int inputpilihan = pilihan.nextInt();

        switch (inputpilihan) {
            case 1:
                System.out.print("Masukkan NIM: ");

                String NIM = nim.nextLine();
                if (NIM.length() < 15) {
                    System.out.print("NIM kurang dari 15 digit");

                } else if (NIM.length() > 15) {
                    System.out.print("NIM lebih dari 15 digit)");

                } else {
                    System.out.print("Login success");
                }
                break;

            case 2:
                System.out.print("Username: \n");
                String username = nim.nextLine();
                System.out.print(" password: \n");
                String password = nim.nextLine();

                if (username.equals("admin")) {
                    if (password.equals("admin")) {
                        System.out.print("Login admin succes");
                    }
                } else {
                    System.out.print("tidak ada pengguna");
                }
                break;

            case 3:
                break;
        }


    }
}