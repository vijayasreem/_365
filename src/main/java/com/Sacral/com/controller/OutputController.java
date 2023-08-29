package com.Sacral.com.controller;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.com.model.Output;
import com.Sacral.com.service.OutputService;

@RestController
public class OutputController {

    @Autowired
    OutputService outputService;

    @PostMapping("/generateEndorsementSummaryLetter")
    public ResponseEntity<Output> generateEndorsementSummaryLetter(@RequestBody Output output) {
        output.setEndorsementNumber(UUID.randomUUID().toString());
        output.setGenerationTime(LocalDateTime.now());
        Output generatedOutput = outputService.generateEndorsementSummaryLetter(output);
        return new ResponseEntity<>(generatedOutput, HttpStatus.OK);
    }

    @GetMapping("/getEndorsementSummaryLetter")
    public ResponseEntity<Output> getEndorsementSummaryLetter(@RequestParam String endorsementNumber) {
        Output output = outputService.getEndorsementSummaryLetter(endorsementNumber);
        return new ResponseEntity<>(output, HttpStatus.OK);
    }

    @DeleteMapping("/deleteEndorsementSummaryLetter")
    public ResponseEntity<String> deleteEndorsementSummaryLetter(@RequestBody Output output) {
        outputService.deleteEndorsementSummaryLetter(output);
        return new ResponseEntity<>("Endorsement Summary Letter deleted successfully", HttpStatus.OK);
    }

}