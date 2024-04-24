package com.app.willcast.model.entity.relations.bidirectional.manyToMany;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "bi_Student_many_to_many")
@Table(name = "bi_Student_many_to_many")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "authorList")
    private List<BookEntity> bookList;
}
