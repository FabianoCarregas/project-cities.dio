package com.project.github.fabianocarregas.citiesapirest.countries.repository;

import com.project.github.fabianocarregas.citiesapirest.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
