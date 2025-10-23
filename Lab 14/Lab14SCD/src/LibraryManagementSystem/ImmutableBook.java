package LibraryManagementSystem;

//Immutable Book Class
public final class ImmutableBook<T> {
 private final T bookID;
 private final String title;
 private final String author;

 public ImmutableBook(T bookID, String title, String author) {
     this.bookID = bookID;
     this.title = title;
     this.author = author;
 }

 public T getBookID() {
     return bookID;
 }

 public String getTitle() {
     return title;
 }

 public String getAuthor() {
     return author;
 }

 @Override
 public String toString() {
     return "ImmutableBook [Book ID: " + bookID + ", Title: " + title + ", Author: " + author + "]";
 }
}

