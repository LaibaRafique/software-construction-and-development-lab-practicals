package LibraryManagementSystem;

//Mutable Book Class
public class MutableBook<T> {
 private T bookID;
 private String title;
 private String author;

 public MutableBook(T bookID, String title, String author) {
     this.bookID = bookID;
     this.title = title;
     this.author = author;
 }

 public T getBookID() {
     return bookID;
 }

 public void setBookID(T bookID) {
     this.bookID = bookID;
 }

 public String getTitle() {
     return title;
 }

 public void setTitle(String title) {
     this.title = title;
 }

 public String getAuthor() {
     return author;
 }

 public void setAuthor(String author) {
     this.author = author;
 }

 @Override
 public String toString() {
     return "MutableBook [Book ID: " + bookID + ", Title: " + title + ", Author: " + author + "]";
 }
}

