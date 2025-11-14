package guru.springframework.spring6webapp.domain;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Publisher {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String addressLine1;
  private String city;
  private String state;
  private String zip;

  @OneToMany(mappedBy = "publisher")
  private Set<Book> books = new java.util.HashSet<>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 83 * hash + Objects.hashCode(this.id);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Publisher other = (Publisher) obj;
    return Objects.equals(this.id, other.id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Publisher{");
    sb.append("id=").append(id);
    sb.append(", name=").append(name);
    sb.append(", addressLine1=").append(addressLine1);
    sb.append(", city=").append(city);
    sb.append(", state=").append(state);
    sb.append(", zip=").append(zip);
    sb.append('}');
    return sb.toString();
  }

  public Set<Book> getBooks() {
    return books;
  }

  public void setBooks(Set<Book> books) {
    this.books = books;
  }

}
