package com.crimsonlogic.collections.maps_example.library;

import java.util.*;

public class LibraryService {

    HashMap<Integer, Books> library = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    // Add Book
    void addBook() {

        System.out.println("Enter Book Id");
        int id = sc.nextInt();
        sc.nextLine();

        if (library.containsKey(id)) {
            System.out.println("Duplicate Book Id");
            return;
        }

        System.out.println("Enter Title");
        String title = sc.nextLine();

        System.out.println("Enter Author");
        String author = sc.nextLine();

        System.out.println("Enter Category");
        String category = sc.nextLine();

        System.out.println("Enter Price");
        double price = sc.nextDouble();

        Books book =
                new Books(id, title, author, category, price);

        library.put(id, book);

        System.out.println("Book Added Successfully");
    }

    // Search Book
    void searchBook() {

        System.out.println("Enter Book Id");
        int id = sc.nextInt();

        Books book = library.get(id);

        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book Not Found");
        }
    }

    // Update Price
    void updatePrice() {

        System.out.println("Enter Book Id");
        int id = sc.nextInt();

        Books book = library.get(id);

        if (book != null) {

            System.out.println("Enter New Price");
            double price = sc.nextDouble();

            book.setPrice(price);

            System.out.println("Price Updated");
        } else {
            System.out.println("Book Not Found");
        }
    }

    // Issue Book
    void issueBook() {

        System.out.println("Enter Book Id");
        int id = sc.nextInt();

        Books book = library.get(id);

        if (book != null) {

            if (!book.isIssued()) {
                book.setIssued(true);
                System.out.println("Book Issued");
            } else {
                System.out.println("Already Issued");
            }

        } else {
            System.out.println("Book Not Found");
        }
    }

    // Return Book
    void returnBook() {

        System.out.println("Enter Book Id");
        int id = sc.nextInt();

        Books book = library.get(id);

        if (book != null) {

            book.setIssued(false);

            System.out.println("Book Returned");
        } else {
            System.out.println("Book Not Found");
        }
    }

    // Remove Book
    void removeBook() {

        System.out.println("Enter Book Id");
        int id = sc.nextInt();

        if (library.remove(id) != null) {
            System.out.println("Book Removed");
        } else {
            System.out.println("Book Not Found");
        }
    }

    // Display Books
    void displayBooks() {

        for (Map.Entry<Integer, Books> entry : library.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    // Count Books
    void countBooks() {
        System.out.println("Total Books : " + library.size());
    }

    // Clear Library
    void clearLibrary() {

        library.clear();

        System.out.println("Library Cleared");
    }

    // Display Available Books
    void availableBooks() {

        for (Books book : library.values()) {

            if (!book.isIssued()) {
                System.out.println(book);
            }
        }
    }

    // Category Count
    void categoryCount() {

        HashMap<String, Integer> count = new HashMap<>();

        for (Books book : library.values()) {

            String category = book.getCategory();

            count.put(category,
                    count.getOrDefault(category, 0) + 1);
        }

        System.out.println(count);
    }

    // Costliest Book
    void costliestBook() {

        Books costliest = null;

        for (Books book : library.values()) {

            if (costliest == null ||
                    book.getPrice() > costliest.getPrice()) {

                costliest = book;
            }
        }

        System.out.println(costliest);
    }

    // Sort By Title
    void sortByTitle() {

        List<Books> list =
                new ArrayList<>(library.values());

        list.sort(
                Comparator.comparing(Books::getTitle));

        list.forEach(System.out::println);
    }

    // Sort By Price
    void sortByPrice() {

        List<Books> list =
                new ArrayList<>(library.values());

        list.sort(
                Comparator.comparingDouble(Books::getPrice));

        list.forEach(System.out::println);
    }

    public void  helper() {


        Scanner sc = new Scanner(System.in);
        LibraryService service = new LibraryService();

        while (true) {

            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Update Price");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Display Books");
            System.out.println("8. Count Books");
            System.out.println("9. Available Books");
            System.out.println("10. Category Wise Count");
            System.out.println("11. Costliest Book");
            System.out.println("12. Sort By Title");
            System.out.println("13. Sort By Price");
            System.out.println("14. Clear Library");
            System.out.println("15. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> service.addBook();
                case 2 -> service.searchBook();
                case 3 -> service.updatePrice();
                case 4 -> service.issueBook();
                case 5 -> service.returnBook();
                case 6 -> service.removeBook();
                case 7 -> service.displayBooks();
                case 8 -> service.countBooks();
                case 9 -> service.availableBooks();
                case 10 -> service.categoryCount();
                case 11 -> service.costliestBook();
                case 12 -> service.sortByTitle();
                case 13 -> service.sortByPrice();
                case 14 -> service.clearLibrary();
                case 15 -> System.exit(0);
                default -> System.out.println("Invalid Choice");
            }
        }

    }

}