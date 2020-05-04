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
        Book book1 = new Book("Johnny Bravo","Hey mama",2010,"KT387297");
        Book book2 = new Book("Hanna Montana","Wrecking Ball",2012,"GHdiadjld7");
        Book book3 = new Book("Daniel Mohr","Bring back",2014,"JU5348hhk");
        Set bookSet = new HashSet();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        MedianAdapter adapter = new MedianAdapter();

        //When
        int result = adapter.publicationYearMedian(bookSet);

        //Than
        assertEquals(2012,result);
    }

}