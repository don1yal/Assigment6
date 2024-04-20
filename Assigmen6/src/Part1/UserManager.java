package Part1;

import java.util.List;

public interface UserManager {

    void borrowBook(int userId, int bookId);
    void returnBook(int userId, int bookId);
    List<Integer> allBooks(int userId);
}

