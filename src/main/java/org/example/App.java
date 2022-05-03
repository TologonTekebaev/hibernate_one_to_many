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

        bookRepository.deleteById(1L);

//        Book book = bookRepository.findById(4L);
//        Vendor vendor = vendorRepository.findById(1L);
//        System.out.println(vendor);
//        vendor.setBook(book);
//        vendorRepository.update(vendor);

//        Vendor vendor = vendorRepository.findById(1L);
//
//        Book book1 = new Book(
//                "Troya", "Homer", BigDecimal.valueOf(1500)
//        );
//
//        bookRepository.save(book1);

//        vendor.setBook(book1);
//        vendorRepository.update(vendor);

//         Vendor vendor = new Vendor();
//
//                Book book1 = new Book(
//                "Toolor kulaganda", "Chyngyz Aitmatov", BigDecimal.valueOf(900)
//                );
//
//                Book book2 = new Book(
//                        "Kanybek", "Kasymaaly Jantoshev", BigDecimal.valueOf(1200)
//                );
//
//                vendor.setBooks(List.of(book1, book2));
//                vendorRepository.save(vendor);


//        Book book = new Book(
//                "Kyamat", "Chyngyz Aitmatov", BigDecimal.valueOf(1000)
//
//        );
//
//        bookRepository.save(book);
//        bookRepository.findAll().forEach(System.out::println);

//        Vendor vendor = new Vendor("Ulan", "ulan@gmail.com");
//        vendor.setBooks();
//        vendorRepository.save(vendor);

        bookRepository.close();
        vendorRepository.close();
    }
}
