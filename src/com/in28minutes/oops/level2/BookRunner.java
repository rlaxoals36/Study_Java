package com.in28minutes.oops.level2;


public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(123,"Java","Ranga");
        book.addReview(new Review(10,"Great Book",5));
        book.addReview(new Review(10,"Bad Book",3));
    }
}
