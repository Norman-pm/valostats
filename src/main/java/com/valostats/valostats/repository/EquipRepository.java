package com.valostats.valostats.repository;

import com.valostats.valostats.model.Equip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipRepository  extends JpaRepository <Equip, Long> {
}
