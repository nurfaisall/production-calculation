package com.example.demo.service;

import com.example.demo.dto.GetDateTIme;
import com.example.demo.dto.PostDateTime;
import com.example.demo.entity.TempData;
import com.example.demo.repository.TempDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TempDataService {

    @Autowired
    TempDataRepository tempDataRepository;

    public List<TempData> getAllTempData() {
        return tempDataRepository.findAll();
    }

    public List<TempData> saveAllTempData(List<TempData> payloads,String position) {
        for (TempData payload : payloads) {
            payload.setProses(position);
            tempDataRepository.save(payload);

        }
        return payloads;


    }

    public GetDateTIme getDateTimeService(PostDateTime payload){
        GetDateTIme getDateTIme = new GetDateTIme();
        List<TempData> monthList = new ArrayList<TempData>();
        List<Map<Integer, List<TempData>>> tempYear = new ArrayList<>();

        for (Integer data : payload.getYear()){
            Map<Integer, List<TempData>> year = new HashMap<>();
            year.put(data, tempDataRepository.findByDateUpdateYear(data));
            tempYear.add(year);
        }

        getDateTIme.setYear(tempYear);

        return getDateTIme;
    }
}
