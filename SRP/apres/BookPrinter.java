package SRP.apres;

public class BookPrinter {

    public void PrintToScreen(BookSRP book){
        System.out.println("title"+book.getTitle());
        System.out.println("author"+book.getAuthor());
        System.out.println("content"+book.getAuthor());
    }

    public void printToHTML(BookSRP book){
        System.out.println("\n ===print to HTML");
        System.out.println("<h1>" + book.getTitle()+ "</h1>");
        System.out.println("<h2>par" + book.getAuthor()+ "</h2>");
        System.out.println("<p>" + book.getContent() + "</p>");
    }
}
