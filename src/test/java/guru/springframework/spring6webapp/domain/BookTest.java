package guru.springframework.spring6webapp.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class BookTest {

  @Test
  void gettersAndSetters() {
    Book b = new Book();
    b.setId(10L);
    b.setTitle("Effective Java");
    b.setIsbn("0134685997");

    assertAll("book getters",
        () -> assertEquals(10L, b.getId()),
        () -> assertEquals("Effective Java", b.getTitle()),
        () -> assertEquals("0134685997", b.getIsbn())
    );
  }

  @Test
  void equalsAndHashCode() {
    Book b1 = new Book();
    Book b2 = new Book();

    // both ids null -> per implementation they are equal
    assertTrue(b1.equals(b2));
    assertEquals(b1.hashCode(), b2.hashCode());

    b1.setId(100L);
    b2.setId(100L);
    assertTrue(b1.equals(b2));
    assertEquals(b1.hashCode(), b2.hashCode());

    b2.setId(101L);
    assertFalse(b1.equals(b2));
  }

  @Test
  void toStringContainsFieldsAndAuthors() {
    Book b = new Book();
    b.setId(3L);
    b.setTitle("Domain-Driven Design");
    b.setIsbn("0321127420");

    Author a = new Author();
    a.setId(7L);
    a.setFirstName("Eric");
    a.setLastName("Evans");

    Set<Author> authors = new HashSet<>();
    authors.add(a);
    b.setAuthors(authors);

    String s = b.toString();
    assertTrue(s.contains("Domain-Driven Design"));
    assertTrue(s.contains("0321127420"));
    assertTrue(s.contains("Eric"));
  }
}
