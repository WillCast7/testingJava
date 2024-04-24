package com.app.willcast.model.entity.relations.unidirectional.oneToOne;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "uni_Employee_one_to_one")
@Table(name = "uni_Employee_one_to_one")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "parking_spot_id")
    private ParkingSpotEntity parkingSpot;
}
