package SRP.apres;

public class BookSaver {

    public void SaveToDataBase(BookSRP book){
        System.out.println("\nsauvegarde de '" + book.getTitle() + "'en base de données...");
    }

    public void SaveToFile(BookSRP book, String filename){
        System.out.println("\nsauvegarde de '" + book.getTitle() + "dans"+ filename);
    }
}
