package com.example.demo.dto;

import com.example.demo.entity.TempData;

import java.util.List;
import java.util.Map;

public class GetDateTIme {
    public void setYear(List<Map<Integer, List<TempData>>> year) {
        this.year = year;
    }

    List<Map<Integer ,List<TempData>>> year;
    List<TempData> month;
    List<TempData> date;

    public List<Map<Integer, List<TempData>>> getYear() {
        return year;
    }



    public List<TempData> getMonth() {
        return month;
    }

    public void setMonth(List<TempData> month) {
        this.month = month;
    }

    public List<TempData> getDate() {
        return date;
    }

    public void setDate(List<TempData> date) {
        this.date = date;
    }

}
