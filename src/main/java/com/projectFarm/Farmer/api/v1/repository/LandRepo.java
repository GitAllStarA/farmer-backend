package com.projectFarm.Farmer.api.v1.repository;

import com.projectFarm.Farmer.api.v1.model.Land;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface LandRepo extends JpaRepository<Land, Long> {
    List<Land> findByName(String name);


}
