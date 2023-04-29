package com.projectFarm.Farmer.api.v1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "land", schema = "farming")
public class Land {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    int length;
    int width;
    String location;

    public Land(String name, int length, int width){
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public Land(String name, int length, int width, String location){
        this.name = name;
        this.length = length;
        this.width = width;
        this.location = location;
    }
}
