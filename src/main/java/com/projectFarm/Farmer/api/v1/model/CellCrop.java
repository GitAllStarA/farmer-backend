package com.projectFarm.Farmer.api.v1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cell_crop", schema = "farming")
public class CellCrop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String cell;
    String crop;
    String sowDateTime;
    int relativePosition;


    public CellCrop(String name, String cell, String crop, String sowDateTime, int relativePosition) {
        this.name = name;
        this.cell = cell;
        this.crop = crop;
        this.sowDateTime = sowDateTime;
        this.relativePosition = relativePosition;

    }
}
