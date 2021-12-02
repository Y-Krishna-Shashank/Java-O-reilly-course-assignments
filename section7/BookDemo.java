public class BookDemo {
    public static void main(String[] args) {
        Book mathBook = new Book("James Stewart", "Calculus", "Math", 1392);
        Book javaBook = new Book("Herbert Schildt", "Java: The complete reference", "Programming language", 1024);
        javaBook.printBookDetails();
        System.out.println();
        mathBook.printBookDetails();
    }

//    public static void printBookDetails(Book book) {
//        System.out.println(book.getTitle());
//        System.out.println("by " + book.getAuthor());
//        System.out.println("has "+book.getNumPages()+" pages, and its genre is "+book.getGenre());
//
//    }
}
