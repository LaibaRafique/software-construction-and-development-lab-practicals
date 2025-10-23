package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Abstract Data Type for managing a collection of books
public class Library<T> {
    private List<T> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(T book) {
        books.add(book);
    }

    public List<T> getBooks() {
        return books;
    }

    public T searchBookByTitle(String title) throws BookNotFoundException {
        for (T book : books) {
            if (book instanceof MutableBook<?>) {
                if (((MutableBook<?>) book).getTitle().equalsIgnoreCase(title)) {
                    return book;
                }
            } else if (book instanceof ImmutableBook<?>) {
                if (((ImmutableBook<?>) book).getTitle().equalsIgnoreCase(title)) {
                    return book;
                }
            }
        }
        throw new BookNotFoundException("Book with title '" + title + "' not found.");
    }
}


