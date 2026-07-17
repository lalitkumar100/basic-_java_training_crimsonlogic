package com.crimsonlogic.collections.maps_example.library;

public class Books {


    private int bookId;
    private String title;
    private String author;
    private String category;

    private boolean issued =false;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private  double price ;
    @Override
    public String toString() {
        return "====================Books================" +
                "bookId=" + bookId + '\n' +
                ", title='" + title + '\n' +
                ", author='" + author + '\n' +
                ", issued=" + issued + '\n' +
                "=========================================";
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public Books(int bookId, String title, String author, String category,double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
       this.price = price;
    }
}
