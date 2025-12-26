package SRP.avant;

public class Book {

    private String title;
    private String author;
    private String content;

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public void PrintToScreen(){
        System.out.println("title"+title);
        System.out.println("author"+author);
        System.out.println("content"+content);
    }

    public void SaveToDataBase(){

        System.out.println("Sauvegarde du livre "+ title+"' en base de données...");
    }

    public void Emprunter(String lecteur){

        System.out.println("Emprunt du livre '"+ title + "'par "+ lecteur);
    }

}
