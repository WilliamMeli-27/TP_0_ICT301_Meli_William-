package SRP.avant;

public class Main {

    public static void main(String[] args){

        Book book = new Book("Les principes SOLID ", "Etudiants de M1-GL", "Revision des principes SOLID");
        book.PrintToScreen();
        book.SaveToDataBase();
        book.Emprunter("Marcial");
    }
}