package com.mycompany.main1;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private int isbn;
    private String title;
    private String author;
    private String publisher;
    private int publicationYear;
    private int quantity;
    private boolean available;

    public Book(int isbn, String title, String author, String publisher, int publicationYear, int quantity, boolean available) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.quantity = quantity;
        this.available = available;
    }
    public int getIsbn() { 
        return isbn; 
    }
    public void setIsbn(int isbn) { 
        this.isbn = isbn; 
    }
    public String getTitle() { 
        return title; 
    }
    public void setTitle(String title) { 
        this.title = title;
    }
    public String getAuthor() { 
        return author; 
    }
    public void setAuthor(String author) { 
        this.author = author; 
    }

    public String getPublisher() { 
        return publisher;
    }
    public void setPublisher(String publisher) { 
        this.publisher = publisher; 
    }

    public int getPublicationYear() { 
        return publicationYear; 
    }
    public void setPublicationYear(int publicationYear) { 
        this.publicationYear = publicationYear; 
    }

    public int getQuantity() { 
        return quantity; 
    }
    public void setQuantity(int quantity) { 
        this.quantity = quantity; 
    }

    public boolean isAvailable() { 
        return available; 
    }
    public void setAvailable(boolean available) { this.available = available; }
}

class User {
    private String name;
    private String email;
    private int phone;

    public User(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getters and setters for User
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getPhone() { return phone; }
    public void setPhone(int phone) { this.phone = phone; }
}
class Staff extends User {
    private int staffId;

    public Staff(int staffId, String name, String email, int phone) {
        super(name, email, phone);
        this.staffId = staffId;
    }

    // Getters and setters for Staff
    public int getStaffId() { return staffId; }
    public void setStaffId(int staffId) { this.staffId = staffId; }
}
class Member extends User {
    private int memberId;

    public Member(int memberId, String name, String email, int phone) {
        super(name, email, phone);
        this.memberId = memberId;
    }

    // Getters and setters for Member
    public int getMemberId() { return memberId; }
    public void setMemberId(int memberId) { this.memberId = memberId; }
}

class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private ArrayList<Staff> staff;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        staff = new ArrayList<>();
    }
    public void addBook(Book book) { books.add(book); }
    public void removeBook(int isbn) { books.removeIf(book -> book.getIsbn() == isbn); }
    public Book searchBookByISBN(int isbn) {
        for (Book book : books) {
            if (book.getIsbn() == isbn) return book;
        }
        return null;
    }

    // Methods for managing members
    public void addMember(Member member) { members.add(member); }
   public void addStaff(Staff staffMember) { staff.add(staffMember); }
}
public class Main1 {
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
        scanner.nextLine(); // Consume newline

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
            scanner.nextLine(); // Consume newline

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
                    return; // Go back to the main menu
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
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addMember(library, scanner);
                    break;
                case 2:
                    return; // Go back to the main menu
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
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                addStaff(library, scanner);
                break;
            case 2:
                return; // Go back to the main menu
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

    private static void addBook(Library library, Scanner scanner) {
        System.out.print("Enter ISBN: ");
        int isbn = scanner.nextInt();
        scanner.nextLine(); // consume newline
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