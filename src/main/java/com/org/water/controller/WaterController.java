package com.org.water.controller;
import com.org.water.model.WaterModel;
import com.org.water.repository.WaterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WaterController {


    @Autowired
    private WaterRepo waterRepo;


    @PostMapping("/Create")
    public void createWaterDetails(@RequestBody WaterModel watermodel) {
        waterRepo.save(watermodel);
    }


    @GetMapping("/getDetails")
    public List<WaterModel> getDetails() {
        List<WaterModel> all = waterRepo.findAll();
        return all;
    }
}
