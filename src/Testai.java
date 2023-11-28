import lt.techin.library.BookCatalog;
import lt.techin.library.test.AbstractLibraryTest;

public class Testai extends AbstractLibraryTest {
    @Override
    protected BookCatalog createBookCatalog() {
        return new BookCatalogImpl();



    }

//    protected isBookInCatalog(String isbn){

    }





