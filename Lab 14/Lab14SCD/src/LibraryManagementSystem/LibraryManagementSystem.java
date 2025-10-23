package LibraryManagementSystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        try {
            // Create library
            Library<Object> library = new Library<>();

            // Create and add mutable books
            MutableBook<Integer> book1 = new MutableBook<>(101, "Java Programming", "James Gosling");
            MutableBook<Integer> book2 = new MutableBook<>(102, "Data Structures", "Mark Allen Weiss");
            library.addBook(book1);
            library.addBook(book2);

            // Create and add immutable books
            ImmutableBook<Integer> book3 = new ImmutableBook<>(201, "Operating Systems", "Abraham Silberschatz");
            ImmutableBook<Integer> book4 = new ImmutableBook<>(202, "Database Systems", "Raghu Ramakrishnan");
            library.addBook(book3);
            library.addBook(book4);

            // Display all books
            System.out.println("Books in the library:");
            for (Object book : library.getBooks()) {
                System.out.println(book);
            }

            // Search for a book by title
            System.out.println("\nSearching for 'Data Structures':");
            System.out.println(library.searchBookByTitle("Data Structures"));

            // Search for a non-existent book
            System.out.println("\nSearching for 'Artificial Intelligence':");
            System.out.println(library.searchBookByTitle("Artificial Intelligence"));

        } catch (BookNotFoundException e) {
            System.out.println("\nException Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

