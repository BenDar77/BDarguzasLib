import lt.techin.library.Author;
import lt.techin.library.Book;
import lt.techin.library.BookCatalog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class BookCatalogImpl implements BookCatalog {

    //testAddBook();
    ArrayList<Book> allBooks = new ArrayList<Book>();
    ArrayList<Author> allAuthors = new ArrayList<Author>();


    @Override
    public void addBook(Book book) {
        allBooks.add(book);

    }

    @Override
    public Book getBookByIsbn(String s) {
        for (Book book : allBooks) {
            if (book.getIsbn().equals(s)) {
                return getBookByIsbn(s);

            }
        }
        return null;
    }

    @Override
    public List<Book> searchBooksByAuthor(String s) {
        for (Book book : allBooks) {
            if (book.getAuthors().equals(s)) {
                return searchBooksByAuthor(s);
            }
        }
        return null;
    }












    @Override
    public int getTotalNumberOfBooks() {
        return allBooks.size();
    }

    @Override
    public boolean isBookInCatalog(String s) {
        return false;
    }

    @Override
    public boolean isBookAvailable(String s) {
        return false;
    }

    @Override
    public Book findNewestBookByPublisher(String s) {
        return null;
    }

    @Override
    public List<Book> getSortedBooks() {
        return null;
    }

    @Override
    public Map<String, List<Book>> groupBooksByPublisher() {
        return null;
    }

    @Override
    public List<Book> filterBooks(Predicate<Book> predicate) {
        return null;
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        return null;
    }

}