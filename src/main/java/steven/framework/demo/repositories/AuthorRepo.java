package steven.framework.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import steven.framework.demo.domain.Author;

public interface AuthorRepo  extends CrudRepository<Author, Long> {

}
