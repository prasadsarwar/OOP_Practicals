class Publication {
    String title;
    double price;
    int copies;

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public void saleCopy(int numCopies) {
        System.out.println("Total sale for " + title + ": " + numCopies * price);
    }
}

class Book extends Publication {
    String author;

    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    public void orderCopies(int numCopies) {
        copies += numCopies;
        System.out.println("Copies of " + title + " ordered: " + numCopies);
    }
}

class Magazine extends Publication {
    int orderQty;
    String currentIssue;

    public Magazine(String title, double price, int copies, int orderQty, String currentIssue) {
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currentIssue = currentIssue;
    }

    public void orderQty(int qty) {
        orderQty += qty;
    }

    public void receiveIssue(String issue) {
        currentIssue = issue;
        System.out.println("Received new issue: " + currentIssue);
    }
}

public class BookMagazine {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", 500, 10, "Author A");
        Book book2 = new Book("Data Structures", 300, 5, "Author B");

        Magazine mag1 = new Magazine("Tech Weekly", 100, 20, 50, "October Issue");

        book1.orderCopies(5);
        book1.saleCopy(10);

        book2.orderCopies(3);
        book2.saleCopy(7);

        mag1.receiveIssue("November Issue");
        mag1.saleCopy(30);
    }
}
