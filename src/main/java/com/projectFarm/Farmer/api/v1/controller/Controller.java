package com.projectFarm.Farmer.api.v1.controller;


import com.projectFarm.Farmer.api.v1.model.CellCrop;
import com.projectFarm.Farmer.api.v1.model.Land;
import com.projectFarm.Farmer.api.v1.service.CellCropServiceClass;
import com.projectFarm.Farmer.api.v1.service.LandServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {

    @Autowired
    LandServiceClass landServiceClass;

    @Autowired
    CellCropServiceClass cellCropServiceClass;
    private CellCrop cellCrop;

    @GetMapping("/v1/hello")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }

    @GetMapping("/v1/ld")
    //http://localhost:9090/v1/ld?lname=test&lh=5&wh=6
    public String landDynamics(@RequestParam("lname") String landName,
                               @RequestParam("lh") int length,
                               @RequestParam("wh") int width,
                               @RequestParam("location") String location) {
        //Length (in feet) x width (in feet) = area in sq. ft.
        String landDyn = "your land dynamics is length : " + length + "ft and width : " + width + "ft" + " and land name is " + landName + " " + location;
        System.out.println(landDyn);
        landServiceClass.saveLandDynamics(landName, length, width, location);
        return landDyn;
    }

    @GetMapping("/v1/findLand")
    public ResponseEntity<List<Land>> findLand(@RequestParam("lname") String landName) {
        String result = "Welcome Back,";
        String details = "Land Details are : ";
        List<Land> x = landServiceClass.findByName(landName);
        System.out.println(x);
        var rep = ResponseEntity.ok(x);
        return ResponseEntity.ok(x);
    }

    @GetMapping("/v1/addCrop")
    public String addCrop(@RequestParam("lname") String lname,
                          @RequestParam("gridCell") String cell,
                          @RequestParam("cname") String cname,
                          @RequestParam("sowDateTime") String sowDatTime,
                          @RequestParam("relativePosition") int relativePosition) {
        String crop = "land name :"+lname+", seeds "+cname+", Grid cell :"+cell+", Sow date time :"+sowDatTime+ "relative position : "+relativePosition;
        cellCropServiceClass.saveCellCrop(lname,cell,cname,sowDatTime,relativePosition);
        return crop;
    }
}
