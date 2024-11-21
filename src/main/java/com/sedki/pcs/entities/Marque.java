package com.sedki.pcs.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Marque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMarq;
    
    private String nomMarq;
    
    private String descriptionMarq;

    @JsonIgnore
    @OneToMany(mappedBy = "marque")
    private List<Pc> pcs;

}
