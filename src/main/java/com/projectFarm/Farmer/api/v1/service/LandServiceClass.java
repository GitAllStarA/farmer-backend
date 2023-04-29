package com.projectFarm.Farmer.api.v1.service;

import com.projectFarm.Farmer.api.v1.model.CellCrop;
import com.projectFarm.Farmer.api.v1.model.Land;
import com.projectFarm.Farmer.api.v1.repository.LandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LandServiceClass {
    @Autowired
    private LandRepo landRepo;

    public Land saveLandDynamics(String name, int length, int width,String location) {
        Land land = new Land(name,length,width,location);
        System.out.println(land.toString());
        return landRepo.save(land);
    }


    public List<Land> findByName(String landName) {
        return landRepo.findByName(landName);
    }


}
