package steven.framework.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import steven.framework.demo.domain.Book;

public interface BookRepo extends CrudRepository<Book, Long> {

}
