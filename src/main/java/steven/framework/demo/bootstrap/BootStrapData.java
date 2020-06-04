package steven.framework.demo.bootstrap;



import steven.framework.demo.domain.Author;
import steven.framework.demo.domain.Book;
import steven.framework.demo.repositories.AuthorRepo;
import steven.framework.demo.repositories.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;

    public BootStrapData(AuthorRepo authorRepo, BookRepo bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "12345");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepo.save(eric);
        bookRepo.save(ddd);

        Author rod = new Author("rod", "Johnson");
        Book noEJB = new Book("J2EE", "22234");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepo.save(rod);
        bookRepo.save(noEJB);

        System.out.println("Starting in bootstrap");
        System.out.println("Num of books " + bookRepo.count());
    }
}
