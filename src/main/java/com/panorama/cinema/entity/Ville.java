package com.panorama.cinema.entity;

import com.panorama.cinema.common.AbstractHibernatePersistanceEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private double longitude, latitude, altitude;

    @OneToMany(mappedBy = "ville")
    private Collection<Cinema> cinemaCollection;

}
