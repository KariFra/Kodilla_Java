package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() throws CloneNotSupportedException {

        //Given
        Library library = new Library("Afternoon Reading");
        library.getBooks().add(new Book("Salatlove", "David Bez", LocalDate.of(2019, 12, 31)));
        library.getBooks().add(new Book("Slodkosci", "Magdalena Markowska", LocalDate.of(2019, 9, 30)));
        library.getBooks().add(new Book("Przepudzenie", "Oliver Sacks", LocalDate.of(1997, 12, 31)));


        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Books that I am reading");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Books to recommend");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().add(new Book("Tulips", "Mary Grey", LocalDate.of(2001, 12, 31)));

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

    }

}