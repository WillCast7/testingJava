package com.app.willcast.model.entity.relations.bidirectional.manyToOne;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "bi_School_many_to_one")
@Table(name = "bi_School_many_to_one")
public class SchoolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "school")
    private List<StudentEntity> studentList;

}
