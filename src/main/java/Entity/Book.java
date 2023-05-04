package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("ALL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")

public class Book<strategy> {
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)




    Long id;
    @Column(name = "bookName")
    int bookID;
    @Column(name = "bookId")
    String bookId;
    @Column(name = "bookColor")
    int bookColor;
}

