package com.valostats.valostats.repository;

import com.valostats.valostats.model.Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatsRepository extends JpaRepository <Stats, Long> {
}
