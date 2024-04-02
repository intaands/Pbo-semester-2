import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Book> booklist = new ArrayList<>();
    static ArrayList<Mahasiswa> userstudent = new ArrayList<>();
    static String NIM;

    static class Book {
        String id;
        String name;
        String author;
        String category;
        int stock;

        Book(String id, String name, String author, String category, int stock) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.category = category;
            this.stock = stock;
        }
    }

    static class Mahasiswa{
        String nama, nim, fakultas, prodi;
        public Mahasiswa(String nama, String nim, String fakultas, String prodi){
            this.nama = nama;
            this.nim = nim;
            this.fakultas = fakultas;
            this.prodi = prodi;
        }
    }

    static Scanner inputswitchcase = new Scanner(System.in);
    static Scanner inputuser = new Scanner(System.in);

    static void menu(){
        int menuloop = 0;
        do{
            System.out.println("\n==== Library System ====");
            System.out.print("\n1. Login as student\n2. Login as admin\n3. Exit\n");
            System.out.print("Choose option (1-3): ");
            int pilihan = inputswitchcase.nextInt();
            switch (pilihan) {
                case 1:
                    student.loginstudent();
                    menustudent();
                    break;
                case 2:
                    menuadmin();
                    break;
                case 3:
                    menuloop = 1;
                    break;
            }
        }while(menuloop == 0);
    }

    static void inputNIM(){
        int ulang = 0;
        while(ulang == 0) {
            System.out.println("Masukkan NIM: ");
            NIM = inputuser.nextLine();
            if (NIM.length() != 15) {
                System.out.println("Harus 15 digit\n");
            } else {
                ulang = 1;
            }
        }
    }

    static void menuadmin() {
        int adminloop;
        do {
            System.out.print("Masukkan Username: \n");
            String username = inputuser.nextLine();
            System.out.print("Massukkan password: \n");
            String password = inputuser.nextLine();
            if (username.equals(admin.username) && password.equals(admin.password)) {
                System.out.println("Login berhasil\n");
                adminloop = 1;
            } else {
                System.out.println("username/password salah");
                adminloop = 0;
            }
        } while (adminloop == 0);
        System.out.println("\n==== Admin Menu ====");
        System.out.println("\n1. Tambah Mahasiswa\n2. Daftar Mahasiswa\n4. Logout");
        System.out.print("Choose option (1-3): ");
        int pilihan = inputswitchcase.nextInt();
        switch (pilihan) {
            case 1:
                admin.addstudent();
                break;
            case 2:
                admin.displaystudent();
                break;
            case 3:
                break;
        }
    }

    static void menustudent(){
        inputNIM();
        System.out.println("\n==== Student Menu ====");
        System.out.print("\n1. Daftar buku\n\n2. Logout");
        System.out.println("\n Choose option (1-3): ");
        int pilihan = inputswitchcase.nextInt();
        switch (pilihan){
            case 1:
                student.displayBooks();
                break;
            case 2:
                student.logout();
                break;
        }
    }

    public static void main(String[] args) {
        booklist.add(new Book("1", "Buku 1", "Author 1", "Category 1", 10));
        booklist.add(new Book("2", "Buku 2", "Author 2", "Category 2", 15));
        booklist.add(new Book("3", "Buku 3", "Author 3", "Category 3", 20));
        menu();

    }
}
