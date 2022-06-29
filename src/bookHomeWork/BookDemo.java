package bookHomeWork;

import java.util.Scanner;

public class BookDemo implements Commands{
    private static Scanner scanner = new Scanner(System.in);

    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input" + EXIT + "for exit");
            System.out.println("please input" + ADD_BOOK + "for create book");
            System.out.println("please input" + PRINT_ALL_BOOKS + "Print Books");
            System.out.println(  "please input" + PRINT_BOOKS_BY_AUTHOR_NAME +"for Print books by autor name");
            System.out.println("PLEASE INPUT" + PRINT_BOOKS_BY_GENRE +" Print Books by Genre" );
            System.out.println("please input" + PRINT_BOOKS_BY_PRICE_RANGE + "Print books by price range ");

            int commant = Integer.parseInt(scanner.nextLine());
            switch (commant) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printBookAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBookGenreName();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBookByPrinceRange();

            }

        }
    }

    private static void printBookByPrinceRange() {
        System.out.println("Please input range from");
        int rangeFrom = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input price to");
        int rangeTo =Integer.parseInt(scanner.nextLine());
        int tmp = 0;
        if (rangeFrom>rangeTo){
            tmp=rangeTo;
            rangeTo=rangeFrom;
            rangeFrom =tmp;
        }
        bookStorage.printBookByPriceRange(rangeFrom,rangeTo);
    }

    private static void printBookGenreName() {
        System.out.println("please input genre name");
        String genreName = scanner.nextLine();
        bookStorage.pritBookByGenreName(genreName);
    }

    private static void printBookAuthorName() {
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        bookStorage.printBooAuthorName(authorName);
    }

    private static void addBook() {
        System.out.println("please input title");
        String title = scanner.nextLine();
        System.out.println("please input name author");
        String AuthorName = scanner.nextLine();
        System.out.println("please input price");
        String priceStr = scanner.nextLine();
        System.out.println("please input count");
        String countStr = scanner.nextLine();
        System.out.println("please input gener");
        String gener = scanner.nextLine();
        double price = Integer.parseInt(priceStr);
        int count = Integer.parseInt(countStr);
        Book book = new Book(title, AuthorName, price, count, gener);
        bookStorage.add(book);
    }
}
