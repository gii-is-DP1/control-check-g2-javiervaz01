package org.springframework.samples.petclinic.feeding;

import java.time.LocalDate;

import javax.persistence.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.Pet;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "feeding")
public class Feeding {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotNull
    @Column(name = "start_date")        
	@DateTimeFormat(pattern = "yyyy/MM/dd")
    LocalDate startDate;

    @NotNull
    @Column(name = "weeks_duration")   
    @Min(1)     
    double weeksDuration;

    @ManyToOne
    @JoinColumn(name = "pet")
    Pet pet;   

    @ManyToOne
    @JoinColumn(name = "feedingType")
    FeedingType feedingType;
}
