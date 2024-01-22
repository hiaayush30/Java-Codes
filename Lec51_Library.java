class Library {
    String[] books;
    int numOfBooks;

    public Library() {
        books = new String[100];
        int numOfBooks = 0;
    }

    public void addBook(String book) {
        this.books[numOfBooks] = book;
        numOfBooks++;
        System.out.println(book + " has been added!");
    }

    public void showAvailableBooks() {
        System.out.println("The books available are:");
        for (String element:books) {
            if (element==null){
                continue;
            }
            System.out.println(">> "+element);
        }
    }

    public void issueBook(String bookName) {
        int i = 0;
        while (i < numOfBooks) {
            if (books[i].equals(bookName)) {
                System.out.println(books[i] + " has been issued!");
                books[i]=null;
                return;
            }
            i++;
            }
        System.out.println("No book with that name found!");

    }
    public void returnBook(String returnedBook){
        for (int i=0;i<numOfBooks;i++){
            if (books[i]==null){
                books[i]=returnedBook;
                System.out.println("The book has been returned successfully");
                return;
            }

        }
        System.out.println("This is a new book!");
        addBook(returnedBook);
    }
}

    public class Lec51_Library {
        public static void main(String[] args) {
            Library c1 = new Library();
            c1.addBook("Think and Grow Rich");
            c1.addBook("Atomic Habits");
            c1.addBook("Da Silva Mind Control Method");

            c1.showAvailableBooks();

            c1.issueBook("Atomic Habits");
            c1.showAvailableBooks();

            c1.returnBook("Atomic Habits");
            c1.showAvailableBooks();

            c1.returnBook("Adventures of Tintin");
            c1.showAvailableBooks();

        }
    }
