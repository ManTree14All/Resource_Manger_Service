package com.mantree.resourceManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mantree.resourceManager.entity.Countries;

public interface CountriesRepo extends JpaRepository<Countries, Integer>{

}
