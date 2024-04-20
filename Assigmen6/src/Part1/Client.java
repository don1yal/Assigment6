package Part1;

public class Client {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();

        libraryManager.addToLibrary(17, "BRAWL STARS", "Orynbai Erdaulet", true );
        libraryManager.addToLibrary(2, "FREE FAIR", "ARMAN AKHYLBEK",true);

        System.out.println(libraryManager.borrowBook(17, 3));
        System.out.println(libraryManager.borrowBook(17,3));

        System.out.println(libraryManager.returnBook(17,3));

        System.out.println(libraryManager.checkAvailable(3));
        System.out.println(libraryManager.checkAvailable(2));



    }
}
