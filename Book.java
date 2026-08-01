public class Book{

    String title;
    String author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Book b1 = new Book(" Harry Potter and the Chamber of Secrets", "J. K. Rowling", 550);

        Book b2 = new Book("Monk Who Sold His Ferrari", "Robin Sharma", 450);

        b1.display();
        b2.display();
    }
}