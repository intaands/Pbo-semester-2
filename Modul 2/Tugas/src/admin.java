import java.util.Scanner;

public class admin {
    static String username = "admin", password = "admin";
    static Scanner inputuser = new Scanner(System.in);


    static void displaystudent(){
        for(Main.Mahasiswa i : Main.userstudent){
            System.out.print("Nama : " +i.nama+ "\n");
            System.out.print("NIM : " +i.nim+ "\n");
            System.out.print("Fakultas : " +i.fakultas+ "\n");
            System.out.print("Prodi : " +i.prodi+ "\n");
        }
    }

    static void addstudent(){
        System.out.print("masukkan Nama:");
        String nama = inputuser.nextLine();
        String nim;
        int ulangi = 0;
        while(ulangi == 0){
            System.out.print("masukkan NIM:");
            nim = inputuser.nextLine();
            if(nim.length() != 15){
                System.out.println("\nNIM harus 15 digit");
                ulangi = 0;
            }else{
                ulangi = 1;
                System.out.print("masukkan Fakultas:");
                String fakultas = inputuser.nextLine();
                System.out.print("masukkan jurusan:");
                String jurusan = inputuser.nextLine();
                Main.userstudent.add(new Main.Mahasiswa(nama, nim,fakultas, jurusan));
                System.out.println("berhasil didaftarkan");
                Main.menuadmin();
            }
        }
    }

}

