package library;

public class Librarian extends User {

    private String employeeNumber;

    // Parameterized Constructor
    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }
    public void addNewBook(Book book) {
        // TODO: Add book to the library catalog.
    }

    public void removeBook(Book book) {
        // TODO: Remove book from the library catalog.
    }

}