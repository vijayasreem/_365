package com.Sacral.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sacral.com.model.Output;

@Repository
public interface OutputRepository extends JpaRepository<Output, Long> {

    Output findByEndorsementNumber(String endorsementNumber);

    Output save(Output output);

    void delete(Output output);

}