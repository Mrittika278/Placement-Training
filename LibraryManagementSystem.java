import java.util.ArrayList;
import java.util.List;


abstract class LibraryItem {

    protected String title;
    protected int itemId;
    protected boolean isAvailable;

   
    LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    
    abstract int getLoanPeriod();

    
    void displayDetails() {
        System.out.println("Title       : " + title);
        System.out.println("Item ID     : " + itemId);
        System.out.println("Available   : " + isAvailable);
        System.out.println("Loan Period : " + getLoanPeriod() + " days");
    }
}



interface Borrowable {

    void borrowItem();

    void returnItem();
}



class Book extends LibraryItem implements Borrowable {

    Book(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int getLoanPeriod() {
        return 14;  
    }

    @Override
    public void borrowItem() {

        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book \"" + title + "\" borrowed successfully.");
            System.out.println("Loan period: " + getLoanPeriod() + " days");
        } else {
            System.out.println("Book \"" + title + "\" is already borrowed.");
        }
    }

    @Override
    public void returnItem() {

        isAvailable = true;
        System.out.println("Book \"" + title + "\" returned successfully.");
    }
}


// Magazine class
class Magazine extends LibraryItem {

    Magazine(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int getLoanPeriod() {
        return 0; 
    }

   
}



class DVD extends LibraryItem implements Borrowable {

    DVD(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int getLoanPeriod() {
        return 7;   
    }

    @Override
    public void borrowItem() {

        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD \"" + title + "\" borrowed successfully.");
            System.out.println("Loan period: " + getLoanPeriod() + " days");
        } else {
            System.out.println("DVD \"" + title + "\" is already borrowed.");
        }
    }

    @Override
    public void returnItem() {

        isAvailable = true;
        System.out.println("DVD \"" + title + "\" returned successfully.");
    }
}



class Librarian {

    private List<LibraryItem> items;

    Librarian() {
        items = new ArrayList<>();
    }

    
    void addItem(LibraryItem item) {
        items.add(item);
    }

    
    void printAllItems() {

        System.out.println("\n===== ALL LIBRARY ITEMS =====");

        for (LibraryItem item : items) {
            System.out.println("\n----------------------------");
            item.displayDetails();
        }
    }
}



public class LibraryManagementSystem {

    public static void main(String[] args) {

        
        Book book = new Book("Java Programming", 101);

        Magazine magazine =
                new Magazine("Technology Today", 102);

        DVD dvd =
                new DVD("The Matrix", 103);


        
        Librarian librarian = new Librarian();

        
        librarian.addItem(book);
        librarian.addItem(magazine);
        librarian.addItem(dvd);


        
        librarian.printAllItems();


        
        System.out.println("\n===== BORROWING BOOK =====");
        book.borrowItem();


        
        System.out.println("\n===== BORROWING DVD =====");
        dvd.borrowItem();


        
        System.out.println("\n===== BORROWING MAGAZINE =====");

        if (magazine instanceof Borrowable) {
            Borrowable borrowableMagazine =
                    (Borrowable) magazine;

            borrowableMagazine.borrowItem();

        } else {
            System.out.println(
                "Magazine \"" + magazine.title +
                "\" cannot be borrowed. It is reference-only."
            );
        }


       
        System.out.println("\n===== RETURNING BOOK =====");
        book.returnItem();


        
        System.out.println("\n===== RETURNING DVD =====");
        dvd.returnItem();
    }
}