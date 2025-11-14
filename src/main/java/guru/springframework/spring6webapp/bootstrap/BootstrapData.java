package guru.springframework.spring6webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import guru.springframework.spring6webapp.repositories.BookRepository;
import jakarta.transaction.Transactional;

@Component
public class BootstrapData implements CommandLineRunner {

  private final BookRepository bookRepository;
  private final AuthorRepository authorRepository;

  public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
    this.authorRepository = authorRepository;
    this.bookRepository = bookRepository;
  }

  @Override
  @Transactional(Transactional.TxType.REQUIRED)
  public void run(String... args) throws Exception {

    Author author = new Author();
    author.setFirstName("Eric");
    author.setLastName("Evans");

    Book book = new Book();
    book.setTitle("Domain Driven Design");
    book.setIsbn("123123");

    Author eric = authorRepository.save(author);

    Book ddd = bookRepository.save(book);
    eric.getBooks().add(ddd);
    eric = authorRepository.save(eric);
    ddd.getAuthors().add(eric);
    ddd = bookRepository.save(ddd);

    System.out.println("Book: " + ddd.getAuthors());
    System.out.println("Author: " + eric.getBooks());

    // add bootstrap logic here
    System.out.println("Bootstrapping data...");
  }

}
