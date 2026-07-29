package library;

public class NovelBook extends Book {
    // Attributes specific to NovelBook
    private String genre;
    private String language;

    // Parameterized Constructor
    public NovelBook(String isbn, String title, String author,
                     String genre, String language) {

        super(isbn, title, author);

        this.genre = genre;
        this.language = language;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Novel Book Details");
        System.out.println("Genre: " + genre);
        System.out.println("Language: " + language);
    }
}


