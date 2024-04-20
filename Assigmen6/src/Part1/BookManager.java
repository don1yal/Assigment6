package Part1;

import java.util.List;

public interface BookManager {
    void add(Book book);
    List<Book> searchTitle(String title);
    List<Book> searchAuthor(String author);
    boolean check(int id);
}
