package com.example.demo.controller;

import com.example.demo.dto.AddPositionDTO;
import com.example.demo.entity.TempData;
import com.example.demo.service.TempDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addPosition")
public class AddPosition
{
    @Autowired
    TempDataService tempDataService;

    @PostMapping("")
    public ResponseEntity<List<TempData>> addPosition(@RequestBody List<TempData> payloads, @RequestParam(name = "position")String position){
        System.out.println("this launch");
        System.out.println(position);
        List<TempData> result = tempDataService.saveAllTempData(payloads, position);

        return ResponseEntity.ok().body(payloads);
    }

}
