public class student {
    static void loginstudent(){
        // Implementasi metode loginstudent
    }

    static void logout(){
        Main.menu();
    }

    static void displayBooks(){
        for (Main.Book book : Main.booklist) {
            System.out.println("ID Buku: " + book.id);
            System.out.println("Nama Buku: " + book.name);
            System.out.println("Author: " + book.author);
            System.out.println("Category: " + book.category);
            System.out.println("Stock: " + book.stock);
            System.out.println("-------------------------");
        }
    }
}
