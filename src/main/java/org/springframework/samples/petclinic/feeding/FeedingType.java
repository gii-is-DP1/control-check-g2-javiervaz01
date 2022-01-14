package org.springframework.samples.petclinic.feeding;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "feeding_types")
public class FeedingType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotEmpty
    @Size(min = 5, max = 30)
    @Column(unique=true)
    String name;

    @NotEmpty
    String description;

    @ManyToOne
    @JoinColumn(name = "pet_type_id")
    @NotNull
    PetType petType;



    

}