package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTest {

    @Test
    public void testPublicationYearMedian(){
        //Given
        Book book = new Book("Johnny Bravo","Hey mama",2010,"KT387297");
        Set bookSet = new HashSet();
        bookSet.add(book);

        MedianAdapter adapter = new MedianAdapter();

        //When
        int result = adapter.publicationYearMedian(bookSet);

        //Than
        assertEquals(2010,result);
    }

}