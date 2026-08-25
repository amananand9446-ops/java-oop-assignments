package library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    private List<Book> bookInventory;
    private List<User> registeredUsers;

    public LibraryManagementSystem(){
        bookInventory=new ArrayList<>();
        registeredUsers=new ArrayList<>();
    }

    public void addBook(Book book) {
        bookInventory.add(book);
    }
  public void registerUser(User user){
        registeredUsers.add(user);
  }

  public List<Book> searchBooks(String criteria){
        List<Book> result=new ArrayList<>();
        for(Book book: bookInventory){

            if(book.getTitle().equalsIgnoreCase(criteria)
                    ||book.getAuthor().equalsIgnoreCase(criteria)){
                result.add(book);
            }
        }
        return result;
  }
    public List<Book> searchBooks(String criteria, String type) {

        List<Book> result = new ArrayList<>();

        for (Book book : bookInventory) {

            if ((book.getTitle().equalsIgnoreCase(criteria)
                    || book.getAuthor().equalsIgnoreCase(criteria))
                    && book.getClass().getSimpleName().equalsIgnoreCase(type)) {

                result.add(book);
            }
        }

        return result;
    }
    public void displayAllBooks() {
        for (Book book : bookInventory) {
            book.displayBookDetails();
            System.out.println();
        }
    }

    public void displayAllUsers() {
        for (User user : registeredUsers) {
            user.displayDashboard();
            System.out.println();
        }
    }
    public void lendBook(Member member, Book book) {

        if (book.lend(member)) {

            member.incrementBorrowCount();

            System.out.println("Book issued successfully.");

        } else {

            System.out.println("Book could not be issued.");

        }
    }
    public void returnBook(Member member, Book book) {

        book.returnItem(member);

        member.decrementBorrowCount();

        System.out.println("Book returned successfully.");
    }

}
