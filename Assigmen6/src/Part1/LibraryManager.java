package Part1;

import java.util.List;

public class LibraryManager {

    private BookManager bookManager;
    private UserManager userManager;

    public LibraryManager() {
        this.bookManager = new BookManageSystem();
        this.userManager = new UserManageSystem();
    }
    public String addToLibrary(int id, String title, String author, boolean available) {
        Book book = new Book(id, title, author, available);
        bookManager.add(book);
        return "The " + book.getTitle() + " is added to library";
    }

    public String borrowBook(int userId, int bookId) {
        if (bookManager.check(bookId)) {
            userManager.returnBook(userId,bookId);
            return "Borrowed by UserId " + userId + ", book: " +bookId;
        }
        return "This book is not available";
    }
    public String returnBook(int userId, int bookId) {
        if (userManager.allBooks(userId).contains(bookId)) {
            userManager.returnBook(userId, bookId);
            return "The userId " + userId + ", return book: " + bookId;
        }
        return "The user not borrow this book";
    }

    public List<Book> searchTitle(String title) {
        return bookManager.searchTitle(title);
    }
    public List<Book> searchAuthor(String author) {
        return bookManager.searchAuthor(author);
    }
    public boolean checkAvailable(int bookId) {
        return bookManager.check(bookId);
    }
}
