package com.projectFarm.Farmer.api.v1.repository;

import com.projectFarm.Farmer.api.v1.model.CellCrop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CellCropRepo extends JpaRepository<CellCrop, Long> {

}
