package com.planets.galaxy.repository;

import com.planets.galaxy.model.Venus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenusRepository extends JpaRepository<Venus, String> {
}
