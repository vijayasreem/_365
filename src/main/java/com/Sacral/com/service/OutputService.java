package com.Sacral.com.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sacral.com.model.Output;
import com.Sacral.com.repository.OutputRepository;

@Service
public class OutputService {

    @Autowired
    OutputRepository outputRepository;

    public Output generateEndorsementSummaryLetter(Output output){
        output.setEndorsementNumber(UUID.randomUUID().toString());
        output.setGenerationTime(LocalDateTime.now());
        outputRepository.save(output);
        return output;
    }

    public Output getEndorsementSummaryLetter(String endorsementNumber){
        Output output = outputRepository.findByEndorsementNumber(endorsementNumber);
        return output;
    }

    public void deleteEndorsementSummaryLetter(Output output){
        outputRepository.delete(output);
    }
}