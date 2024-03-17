package com.example.demo.repository;

import com.example.demo.entity.TempData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TempDataRepository extends JpaRepository<TempData, Long> {

    @Query("SELECT e FROM TempData e WHERE YEAR(e.dateUpdate) = ?1")
    List<TempData> findByDateUpdateYear(int year);

    @Query("SELECT e FROM TempData e WHERE MONTH(e.dateUpdate) = ?1")
    List<TempData> findByDateUpdateMonth(int month);

    List<TempData> findByDateUpdate(LocalDate date);
}
