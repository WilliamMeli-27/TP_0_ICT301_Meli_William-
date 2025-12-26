package SRP.apres;

import SRP.avant.Book;

public class Main {

    public static void main(String[] args){

       BookSRP book = new BookSRP(
               "Tribut",
               "Moliere",
               "Da retour a la maison"
       );

       BookBusinessLogic logic = new BookBusinessLogic();
       logic.Emprunter(book,"Ozil");
    }
}