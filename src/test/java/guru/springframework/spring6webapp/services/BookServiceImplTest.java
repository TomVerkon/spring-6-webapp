/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package guru.springframework.spring6webapp.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

import guru.springframework.spring6webapp.domain.Book;

/**
 *
 * @author tverk
 */
public class BookServiceImplTest {

    public BookServiceImplTest() {
    }

    /**
     * Test of findAll method, of class BookServiceImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        BookServiceImpl instance = null;
        Iterable<Book> expResult = null;
        Iterable<Book> result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}