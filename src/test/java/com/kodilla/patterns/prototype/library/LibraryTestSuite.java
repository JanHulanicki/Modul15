package com.kodilla.patterns.prototype.library;
import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.stream.IntStream;
public class LibraryTestSuite {
        @Test
        public void testGetBooks() {
            //given
            //creating the TasksList for todos
            Library theLibrary = new Library("Lib1");
            IntStream.iterate(1, n -> n + 1)
                    .limit(10)
                    //.forEach(n -> theLibrary.getTasks().add(new Task("To Do Task number " + n)));
            .forEach(n -> theLibrary.getBooks().add(new Book("Title"+n,"Author"+n, LocalDate.now())));


            //making a shallow copy of object board
            Library clonedLibrary = null;
            try {
                clonedLibrary = theLibrary.shallowCopy();
                } catch (CloneNotSupportedException e) {
                System.out.println(e);
            }
            //making a deep copy of object board
            Library deepClonedLibrary = null;
            try {
                deepClonedLibrary  = theLibrary.deepCopy();
                } catch (CloneNotSupportedException e) {
                System.out.println(e);
            }
            //When
            Book book1= new Book("Title100","Author100",LocalDate.now());
            theLibrary.getBooks().add(book1);
            //Then
            System.out.println(theLibrary.getBooks());
            System.out.println(clonedLibrary.getBooks());
            System.out.println(deepClonedLibrary.getBooks());
            Assert.assertEquals(11, theLibrary.getBooks().size());
            Assert.assertEquals(11, clonedLibrary.getBooks().size());
            Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
            Assert.assertEquals(theLibrary.getBooks(),clonedLibrary.getBooks());
            Assert.assertNotEquals(deepClonedLibrary.getBooks(),theLibrary.getBooks());
        }
}

