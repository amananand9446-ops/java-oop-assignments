package library;

public abstract class Book implements Lendable {
   private String isbn;
   private String title;
   private String author;
   private boolean isAvailable;

     // default constructor
   public Book(){
       this.isAvailable=true;
   }
     // parametrized constructor
   public Book(String isbn, String title, String author){
       this.isbn=isbn;
       this.title=title;
       this.author=author;
       this.isAvailable = true;
   }

    // Copy Constructor
    public Book(Book other) {
        this.isbn = other.isbn;
        this.title = other.title;
        this.author = other.author;
        this.isAvailable = other.isAvailable;
    }

    @Override
    public boolean lend(User user) {

        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnItem(User user) {
        isAvailable=true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }
    public abstract void displayBookDetails();

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


}
