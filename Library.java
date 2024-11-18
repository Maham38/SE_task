
package com.mycompany.main2;

import java.util.ArrayList;


class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private ArrayList<Staff> staff;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        staff = new ArrayList<>();
    }
    public void addBook(Book book) { 
        books.add(book); 
    }
    public void removeBook(int isbn) { 
        books.removeIf(book -> book.getIsbn() == isbn); 
    }
    public Book searchBookByISBN(int isbn) {
        for (Book book : books) {
            if (book.getIsbn() == isbn) return book;
        }
        return null;
    }

    public void addMember(Member member) { 
        members.add(member); 
    }
   public void addStaff(Staff staffMember) { 
       staff.add(staffMember); 
   }
}

