package guru.springframework.spring6webapp.domain;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AuthorTest {

  @Test
  void gettersAndSetters() {
    Author a = new Author();
    a.setId(1L);
    a.setFirstName("John");
    a.setLastName("Doe");

    assertAll("author getters",
        () -> assertEquals(1L, a.getId()),
        () -> assertEquals("John", a.getFirstName()),
        () -> assertEquals("Doe", a.getLastName()));
  }

  @Test
  void equalsAndHashCode() {
    Author a1 = new Author();
    Author a2 = new Author();

    // both ids null -> per implementation they are equal
    assertTrue(a1.equals(a2));
    assertEquals(a1.hashCode(), a2.hashCode());

    a1.setId(5L);
    a2.setId(5L);
    assertTrue(a1.equals(a2));
    assertEquals(a1.hashCode(), a2.hashCode());

    a2.setId(6L);
    assertFalse(a1.equals(a2));
  }

  @Test
  void toStringContainsFields() {
    Author a = new Author();
    a.setId(2L);
    a.setFirstName("Alice");
    a.setLastName("Smith");

    String s = a.toString();
    assertTrue(s.contains("Alice"));
    assertTrue(s.contains("Smith"));
    assertTrue(s.contains("2"));
  }
}
