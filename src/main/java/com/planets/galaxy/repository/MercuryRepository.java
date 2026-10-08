package com.planets.galaxy.repository;

import com.planets.galaxy.model.Mercury;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MercuryRepository extends JpaRepository<Mercury, String> {
}
