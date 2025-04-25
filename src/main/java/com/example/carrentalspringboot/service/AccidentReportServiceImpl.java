package com.example.carrentalspringboot.service;

import com.example.carrentalspringboot.dto.AccidentReportDTO;
import com.example.carrentalspringboot.entity.AccidentReport;
import com.example.carrentalspringboot.repository.AccidentReportRepository;
import com.example.carrentalspringboot.tool.AccidentReportConverter;
import jakarta.validation.constraints.NotNull;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class AccidentReportServiceImpl implements AccidentReportService {
    private final AccidentReportRepository accidentReportRepository;
    private final AccidentReportConverter accidentReportConverter;
    //@TODO: implement and import Validation tool
    //@TODO: add LOGGER


    public AccidentReportServiceImpl(AccidentReportRepository accidentReportRepository, AccidentReportConverter accidentReportConverter) {
        this.accidentReportRepository = accidentReportRepository;
        this.accidentReportConverter = accidentReportConverter;
    }


    @Override
    public Page<AccidentReportDTO> getAccidents(Integer offset, Integer limit) {
        Page<AccidentReport> accidentReports = accidentReportRepository.findAll(PageRequest.of(offset, limit));
        return accidentReports.map(accidentReportConverter::fromEntityToDto);
    }

    @Override
    public AccidentReportDTO getAccidentReportById(@NotNull Integer id) {
        AccidentReport accidentReport = accidentReportRepository.findById(id)
                .orElseThrow(() -> {
                    String errorMsg = "Accident report with [ID=" + id + "] was not found";
                    return new NoSuchElementException(errorMsg);
                });
        return accidentReportConverter.fromEntityToDto(accidentReport);
    }

    @Override
    public AccidentReportDTO addAccidentReport(AccidentReportDTO accidentReportDTO) {
        if (accidentReportDTO == null) {
            throw new IllegalArgumentException("Cannot add report because it is null");
        }
        if (accidentReportRepository.existsAccidentReportByBookingId(accidentReportDTO.getBookingId())) {
            throw new DuplicateKeyException("Accident report with " + accidentReportDTO + " that you are trying to add already exists");
        }
        AccidentReport saveReport = accidentReportConverter.fromDtoToEntity(accidentReportDTO);
        accidentReportRepository.save(saveReport);
        return accidentReportConverter.fromEntityToDto(saveReport);
    }

    @Override
    public void deleteAccidentReportById(@NotNull Integer id) {
        Optional<AccidentReport> accidentReport = accidentReportRepository.findById(id);
        if (accidentReport.isEmpty()){
//@TODO:  add later: LOGGER.error(MessageFormat.format("Cannot delete accident report with non existing [ID={0}]", id));
            return;
        }
        accidentReportRepository.deleteById(id);
        //also add logger
    }

    @Override
    public AccidentReportDTO updateAccidentReportById(AccidentReportDTO accidentReportDTO) {//@TODO: implement the method
        return null;
    }
}
