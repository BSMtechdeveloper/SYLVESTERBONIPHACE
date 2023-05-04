package Controller;

import Repository.BooksRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

@SuppressWarnings("ALL")
@RestController
public final class Books {
@Autowired
    private BooksRepository BookRepository;
    private Object UserDetails;

    @SneakyThrows
@GetMapping
   public Object getAllUser() throws Throwable {
        SimpleJpaRepository bookRepository = null;
        return bookRepository.findAll();

    }



    private void ElseThrow (Object userDoesNotExit) {

        }

public class id {
    }
}

