
package com.mycompany.main2;

    public class Book {
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
    public void setAvailable(boolean available) { 
        this.available = available;
    }
}


