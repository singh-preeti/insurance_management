package com.insurance.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.insurance.model.Insurance;

@Service
public interface InsuranceService extends JpaRepository<Insurance,Long> {

}
