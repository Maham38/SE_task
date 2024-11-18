

package com.mycompany.main2;

import java.util.Scanner;


public class Main2 {
    
    public static void main(String[] args) {
    Library library = new Library();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("\nLibrary Management System");
        System.out.println("1. Books");
        System.out.println("2. Members");
        System.out.println("3. Staff");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                bookMenu(library, scanner);
                break;
            case 2:
                memberMenu(library, scanner);
                break;
            case 3:
                staffMenu(library, scanner);
                break;
            case 4:
                System.out.println("Exiting Library Management System.");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}  

    private static void bookMenu(Library library, Scanner scanner) {
        while (true) {
            System.out.println("\nBooks Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by ISBN");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addBook(library, scanner);
                    break;
                case 2:
                    removeBook(library, scanner);
                    break;
                case 3:
                    searchBook(library, scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void memberMenu(Library library, Scanner scanner) {
        while (true) {
            System.out.println("\nMembers Menu:");
            System.out.println("1. Add Member");
            System.out.println("2. Remove Member");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addMember(library, scanner);
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void staffMenu(Library library, Scanner scanner) {
    while (true) {
        System.out.println("\nStaff Menu:");
        System.out.println("1. Add Staff");
        System.out.println("2. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                addStaff(library, scanner);
                break;
            case 2:
                return; 
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

    private static void addBook(Library library, Scanner scanner) {
        System.out.print("Enter ISBN: ");
        int isbn = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter Publication Year: ");
        int year = scanner.nextInt();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Is Available (true/false): ");
        boolean available = scanner.nextBoolean();
        library.addBook(new Book(isbn, title, author, publisher, year, quantity, available));
        System.out.println("Book added successfully.");
    }

    private static void removeBook(Library library, Scanner scanner) {
        System.out.print("Enter ISBN to remove: ");
        int isbn = scanner.nextInt();
        library.removeBook(isbn);
        System.out.println("Book removed successfully.");
    }

    private static void searchBook(Library library, Scanner scanner) {
        System.out.print("Enter ISBN to search: ");
        int isbn = scanner.nextInt();
        Book book = library.searchBookByISBN(isbn);
        if (book != null) {
            System.out.println("Book found: " + book.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void addMember(Library library, Scanner scanner) {
        System.out.print("Enter Member ID: ");
        int memberId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Member Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Member Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Member Phone: ");
        int phone = scanner.nextInt();
        library.addMember(new Member(memberId, name, email, phone));
        System.out.println("Member added successfully.");
    }
    private static void addStaff(Library library, Scanner scanner) {
    System.out.print("Enter Staff ID: ");
    int staffId = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter Staff Name: ");
    String name = scanner.nextLine();
    System.out.print("Enter Staff Email: ");
    String email = scanner.nextLine();
    System.out.print("Enter Staff Phone: ");
    int phone = scanner.nextInt();
    library.addStaff(new Staff(staffId, name, email, phone));
    System.out.println("Staff added successfully.");
}
}

