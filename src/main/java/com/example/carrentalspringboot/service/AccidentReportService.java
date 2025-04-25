package com.example.carrentalspringboot.service;

import com.example.carrentalspringboot.dto.AccidentReportDTO;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;

public interface AccidentReportService {
    Page<AccidentReportDTO> getAccidents(final Integer pageNumber, final Integer size);
    AccidentReportDTO getAccidentReportById(@PathVariable Integer id);
    AccidentReportDTO addAccidentReport(AccidentReportDTO accidentReportDTO);
    void deleteAccidentReportById(@PathVariable Integer id);
    AccidentReportDTO updateAccidentReportById(AccidentReportDTO accidentReportDTO);

}
