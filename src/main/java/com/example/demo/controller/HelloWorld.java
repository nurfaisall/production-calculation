package com.example.demo.controller;

import com.example.demo.dto.GetDateTIme;
import com.example.demo.dto.PostDateTime;
import com.example.demo.entity.TempData;
import com.example.demo.repository.TempDataRepository;
import com.example.demo.service.TempDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.util.List;

@RestController("/")
public class HelloWorld {

    @Autowired
    TempDataService tempDataService;

    @Autowired
    TempDataRepository tempDataRepository;



    @GetMapping("")
    public ResponseEntity<List<TempData>> test() {

//        List<TempData> tempDatas = tempDataService.getAllTempData()
        List<TempData> tempdata = tempDataRepository.findByDateUpdate(LocalDate.now());


        return ResponseEntity.ok().body(tempdata);
    }

    @PostMapping("/findByYear")
    public ResponseEntity<GetDateTIme> findByYear(@RequestBody PostDateTime payload) {
        GetDateTIme result = tempDataService.getDateTimeService(payload);






        return ResponseEntity.ok().body(result);

}
    }