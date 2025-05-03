package com.example.carrentalspringboot.dto;

import com.example.carrentalspringboot.enums.AccidentStatusEnum;
import com.example.carrentalspringboot.enums.AccidentTypeEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class AccidentReportDTO { //@TODO: add validations
    private Integer id;
    private AccidentTypeEnum type;
    private Integer customerId;
    private AccidentStatusEnum status;
    private Integer bookingId;
    private BigDecimal fee;
    private Integer managerId;
    private String notes;


}
