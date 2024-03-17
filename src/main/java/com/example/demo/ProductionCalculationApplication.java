package com.example.demo;

import com.example.demo.entity.TempData;
import com.example.demo.repository.TempDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProductionCalculationApplication {

	@Autowired
	TempDataRepository tempDataRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductionCalculationApplication.class, args);
	}

	@Bean
	public List<TempData> dataDummy(){
		TempData data = new TempData(1L,"GMB",12L);
		TempData data1 = new TempData(2L,"GMB",13L);
		TempData data2 = new TempData(3L,"GMB",14L);
		TempData data3 = new TempData(4L,"GMB",15L);

		List<TempData> datas = List.of(data,data2,data3);

		for(TempData dat : datas) {
			tempDataRepository.save(dat);
		}
		System.out.println("this is launched");
		return datas;

	}

}
