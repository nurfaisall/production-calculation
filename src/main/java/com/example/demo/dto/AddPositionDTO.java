package com.example.demo.dto;

import com.example.demo.entity.TempData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AddPositionDTO {

    public List<TempData> getValue() {
        return value;
    }

    public void setValue(List<TempData> value) {
        this.value = value;
    }

    List<TempData> value;

}
