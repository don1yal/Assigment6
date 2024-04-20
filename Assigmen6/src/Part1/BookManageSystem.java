package Part1;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class BookManageSystem implements BookManager{
    private HashMap<Integer, Book> books = new HashMap<Integer, Book>();

    @Override
    public void add(Book book) {
        books.put(book.getId(), book);
    }
    @Override
    public List<Book> searchTitle(String title) {
        return books.values().stream().filter(
                book -> book.getTitle().toUpperCase().contains(title.toUpperCase())
        ).collect(Collectors.toList());
    }
    @Override
    public List<Book> searchAuthor(String author) {
        return books.values().stream().filter(
                book -> book.getAuthor().toUpperCase().contains(author.toUpperCase())
        ).collect(Collectors.toList());
    }
    @Override
    public boolean check(int id) {
        Book book = books.get(id);
        return book != null && book.isAvailable() ;
    }
}

