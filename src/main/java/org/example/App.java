package org.example;

import org.example.models.Book;
import org.example.models.Vendor;
import org.example.repositories.BookRepository;
import org.example.repositories.VendorRepository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws Exception {

        BookRepository bookRepository = new BookRepository();
        VendorRepository vendorRepository = new VendorRepository();

        bookRepository.deleteById(3L);

//        Vendor vendor = vendorRepository.findById(1L);
//
//        System.out.println("\u001B[35m" + vendor + "\u001B[35m");

//       Book book = new Book(
//                "Torin", "Dubshit", BigDecimal.valueOf(2050));
//        vendor.addBook(book);
//        book.setVendor(vendor);
//        vendorRepository.merge(vendor);
//
//        Book book = bookRepository.findById(1L);
//
//
//        book.setVendor(vendor);
//        vendorRepository.merge(vendor);

//        Vendor tologon = new Vendor("Nurbek",
//                "nurbek@gamil.com");
//
//        Book book = new Book("Hard", "John", BigDecimal.valueOf(1200));
//        tologon.addBook(book);
//
//        tologon.addBook(book);
//        book.setVendor(tologon);
//
//        vendorRepository.save(tologon);

//        bookRepository.save(new Book("Persistence",
//                "John", BigDecimal.valueOf(1500) ));

        bookRepository.close();
        vendorRepository.close();
    }
}
