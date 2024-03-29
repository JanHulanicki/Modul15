package com.kodilla.patterns.prototype.library;
import com.kodilla.patterns.prototype.Prototype;
import java.util.HashSet;
import java.util.Set;
public  class Library extends  Prototype{
    final String name;
    Set<Book> books = new HashSet<>();
    public Library(final String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Set<Book> getBooks() {
        return books;
    }
    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }
    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books= new HashSet<>();

        for(Book theBook : books) {
           clonedLibrary.books.add(theBook) ;
        }
        return clonedLibrary;
    }
}

