package com.app.willcast.model.entity.relations.unidirectional.oneToMany;

import com.app.willcast.model.entity.relations.unidirectional.oneToOne.ParkingSpotEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "uni_Employee_one_to_many")
@Table(name = "uni_Employee_one_to_many")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
