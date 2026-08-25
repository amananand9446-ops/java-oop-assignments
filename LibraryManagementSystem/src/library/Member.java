package library;

public class Member extends User{

    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT = 5;

    public  Member(){
      super();
      this.borrowedBooksCount=0;
    }
    public Member(String name, String contactInfo){
        super(name, contactInfo);
        this.borrowedBooksCount=0;
    }
    public Member(Member other) {
        super(other);
        this.borrowedBooksCount = other.borrowedBooksCount;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    public void incrementBorrowCount() {

        borrowedBooksCount++;
    }
    public void decrementBorrowCount() {
        if (borrowedBooksCount > 0) {
            borrowedBooksCount--;
        }
    }
}
