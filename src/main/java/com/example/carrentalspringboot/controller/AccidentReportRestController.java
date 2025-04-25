package com.example.carrentalspringboot.controller;

import com.example.carrentalspringboot.dto.AccidentReportDTO;
import com.example.carrentalspringboot.service.AccidentReportService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/accidents")
public class AccidentReportRestController {
    private final AccidentReportService accidentReportService;
    private static final Logger LOGGER = LoggerFactory.getLogger(AccidentReportRestController.class);
    private final HttpServletRequest HTTP_SERVLET_REQUEST;

    public AccidentReportRestController(AccidentReportService accidentReportService, HttpServletRequest httpServletRequest) {
        this.accidentReportService = accidentReportService;
        HTTP_SERVLET_REQUEST = httpServletRequest;
    }

    @Operation(summary = "Get accident reports", description = "Get a list of accident reports (paginated)")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the accident reports")
    })
    @GetMapping
    public Page<AccidentReportDTO> getAuthors(
            @RequestParam(defaultValue = "0") final Integer offset,
            @RequestParam(defaultValue = "200") final Integer limit
    ) {
        LOGGER.info("Incoming HTTP GET request to [URL={}]", HTTP_SERVLET_REQUEST.getRequestURL().toString());
        return accidentReportService.getAccidents(offset, limit);
    }

    @Operation(summary = "Get accident report by ID", description = "Get accident report a by it's ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "found the accident report by ID")
    })
    @GetMapping("/report/{id}")
    AccidentReportDTO getAccidentReportById(@PathVariable @NotNull @Positive(message = "accident report ID should be positive number") Integer id) {
        LOGGER.info("Incoming HTTP GET request to [URL={}]", HTTP_SERVLET_REQUEST.getRequestURL().toString());
        return accidentReportService.getAccidentReportById(id);
    }

    @Operation(summary = "Add an accident report", description = "Add a new accident report data")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "new accident report data has been added")
    })
    @PostMapping("/post")
    AccidentReportDTO post(@RequestBody AccidentReportDTO accidentReportDTO) { //@TODO: add post validation
        LOGGER.info("Incoming HTTP POST request to [URL={}]", HTTP_SERVLET_REQUEST.getRequestURL().toString());
        return accidentReportService.addAccidentReport(accidentReportDTO);
    }

    @Operation(summary = "Update an accident report", description = "Update an existing accident report's data")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "accident report data has been updated")
    })
    @PutMapping("/update")
    AccidentReportDTO put(@RequestBody AccidentReportDTO accidentReportDTO) {
        LOGGER.info("Incoming HTTP PATCH request to [URL={}]", HTTP_SERVLET_REQUEST.getRequestURL().toString());
        return accidentReportService.updateAccidentReportById(accidentReportDTO);
    }

    @Operation(summary = "Delete an accident report", description = "Delete an accident report by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "author deleted")
    })
    @DeleteMapping("/delete/{id}")
    void deleteById(@PathVariable @NotNull Integer id) {
        LOGGER.info("Incoming HTTP DELETE request to [URL={}]", HTTP_SERVLET_REQUEST.getRequestURL().toString());
        accidentReportService.deleteAccidentReportById(id);
    }
}
