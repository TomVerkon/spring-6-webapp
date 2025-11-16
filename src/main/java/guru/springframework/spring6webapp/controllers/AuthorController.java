package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthorController {

  private final AuthorService authorService;
  public AuthorController(AuthorService authorService) {
    this.authorService = authorService;
  }

  @RequestMapping(value = "/authors", method = RequestMethod.GET)
  public String getAuthors(Model model) {
    Iterable<Author> authors = authorService.findAll();
    model.addAttribute("authors", authors);
    System.out.println(authors);
    return "authors";
  }
}
