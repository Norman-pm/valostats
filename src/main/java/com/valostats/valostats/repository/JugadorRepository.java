package com.valostats.valostats.repository;

import com.valostats.valostats.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends JpaRepository <Jugador,Long> {

}
