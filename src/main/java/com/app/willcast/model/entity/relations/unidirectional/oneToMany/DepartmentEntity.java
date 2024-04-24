package com.app.willcast.model.entity.relations.unidirectional.oneToMany;

import com.app.willcast.model.entity.relations.unidirectional.oneToMany.EmployeeEntity;
import com.app.willcast.model.entity.relations.unidirectional.oneToOne.ParkingSpotEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "uni_Department_one_to_many")
@Table(name = "uni_Department_one_to_many")
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "employee_id")
    private List<EmployeeEntity> employee;
}
