package com.projectFarm.Farmer.api.v1.service;

import com.projectFarm.Farmer.api.v1.model.CellCrop;
import com.projectFarm.Farmer.api.v1.repository.CellCropRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CellCropServiceClass {

    @Autowired
    CellCropRepo repo;

    public CellCrop saveCellCrop(String name, String cell, String crop,String sowDateTime, int relativePosition) {
        CellCrop cellCrop = new CellCrop(name,cell,crop,sowDateTime,relativePosition);
        return repo.save(cellCrop);
    }
}
