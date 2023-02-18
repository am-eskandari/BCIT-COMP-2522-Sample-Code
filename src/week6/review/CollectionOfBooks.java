package week6.review;

import java.util.ArrayList;
import java.util.List;

public class CollectionOfBooks {
    private ArrayList<Book> books;

    public CollectionOfBooks() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> removeBooks(String title) {
        List<Book> removed = new ArrayList<>();
        for(Book book : books) {
            if(title.equals(book.getTitle())) {
                removed.add(book);
            }
        }
        books.removeAll(removed);
        return removed;
    }
}
