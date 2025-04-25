package com.example.carrentalspringboot.repository;

import com.example.carrentalspringboot.entity.AccidentReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcidentReportRepository extends JpaRepository<AccidentReport, Integer> {
}
