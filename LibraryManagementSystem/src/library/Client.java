package library;

public class Client {
    public static void main(String[] args) {

        // Create Library Management System
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Create TextBooks
        TextBook textBook1 = new TextBook( "TB101",
                "Java Programming",
                "James Gosling",
                "Programming",
                5);
        TextBook textBook2 = new TextBook(
                "TB102",
                "Data Structures",
                "Mark Allen",
                "Computer Science",
                3);

        // Create NovelBooks
        NovelBook novelBook1 = new NovelBook(
                "NB101",
                "The Alchemist",
                "Paulo Coelho",
                "Fiction",
                "English"
        );

        NovelBook novelBook2 = new NovelBook(
                "NB102",
                "Harry Potter",
                "J.K. Rowling",
                "Fantasy",
                "English"
        );

        // Add books to the library
        library.addBook(textBook1);
        library.addBook(textBook2);
        library.addBook(novelBook1);
        library.addBook(novelBook2);


// Create Member objects
        Member member1 = new Member(
                "Aman",
                "9876543210"
        );

        Member member2 = new Member(
                "Rahul",
                "9876543211"
        );

// Create Librarian object
        Librarian librarian1 = new Librarian(
                "Rakesh",
                "9876543222",
                "EMP101"
        );

// Register users
        library.registerUser(member1);
        library.registerUser(member2);
        library.registerUser(librarian1);

        System.out.println("----- Books in Library -----");
        library.displayAllBooks();

        System.out.println("----- Registered Users -----");
        library.displayAllUsers();

        // Test lending
        System.out.println("\n----- Lending Books -----");

        library.lendBook(member1, textBook1);

        library.lendBook(member2, textBook1);

        library.lendBook(member1, novelBook1);

        System.out.println("\n----- Returning Book -----");

// Check availability before returning
        System.out.println("Availability before return: " + textBook1.isAvailable());

// Member1 returns the book
        library.returnBook(member1, textBook1);

// Check availability after returning
        System.out.println("Availability after return: " + textBook1.isAvailable());

// Member2 borrows the same book again
        library.lendBook(member2, textBook1);

        System.out.println("\n----- Search By Title -----");

        for (Book book : library.searchBooks("Java Programming")) {
            book.displayBookDetails();
        }

        System.out.println("\n----- Search By Author -----");

        for (Book book : library.searchBooks("Paulo Coelho")) {
            book.displayBookDetails();
        }

        System.out.println("\n----- Search By Type -----");

        for (Book book : library.searchBooks("Java Programming", "TextBook")) {
            book.displayBookDetails();
        }
    }
}
