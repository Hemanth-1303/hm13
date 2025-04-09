package com.xworkz.libraryapp;

import com.xworkz.libraryapp.constants.BookGenre;
import com.xworkz.libraryapp.librarydto.LibraryDto;
import com.xworkz.libraryapp.generatelibrary.Library;

public class LibraryRunner {

    public static void main(String[] args) {
        System.out.println("Main started");

        LibraryDto dto = new LibraryDto();
        dto.setBookTitle("The book of joy");
        dto.setAuthorName("Dalai Lama");
        dto.setPublisher("Scribner");
        dto.setIsbn("9780743273565");
        dto.setPublishDate("10/04/1925");
        dto.setGenre(BookGenre.FICTION);
        dto.setNumberOfPages(98);

        System.out.println("Book Title: " + dto.getBookTitle());
        System.out.println("Author: " + dto.getAuthorName());
        System.out.println("Publisher: " + dto.getPublisher());
        System.out.println("ISBN: " + dto.getIsbn());
        System.out.println("Publish Date: " + dto.getPublishDate());
        System.out.println("Genre: " + dto.getGenre());
        System.out.println("Pages: " + dto.getNumberOfPages());

        System.out.println("Main ended");

        Library library = new Library();
        library.addBook(dto);
    }
}
