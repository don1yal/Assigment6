package Part1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserManageSystem implements UserManager {
        HashMap<Integer, List<Integer>> books = new HashMap<>();

        @Override
        public void borrowBook ( int userId, int bookId){
            books.computeIfAbsent(userId, k -> new ArrayList<>()).add(bookId);
        }

        @Override
        public void returnBook ( int userId, int bookId){
            if (books.containsKey(userId)) {
                books.get(userId).remove(bookId);
            }
        }
        @Override
        public List<Integer> allBooks ( int userId){
            return books.getOrDefault(userId, new ArrayList<>());
        }

    }
