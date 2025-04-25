package com.example.carrentalspringboot.tool;

import com.example.carrentalspringboot.dto.AccidentReportDTO;
import com.example.carrentalspringboot.entity.AccidentReport;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class AccidentReportConverter implements Serializable {

    public AccidentReportDTO fromEntityToDto(AccidentReport accidentReport) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(accidentReport, AccidentReportDTO.class);
    }

    public AccidentReport fromDtoToEntity(AccidentReportDTO accidentReportDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(accidentReportDTO, AccidentReport.class);
    }
}
