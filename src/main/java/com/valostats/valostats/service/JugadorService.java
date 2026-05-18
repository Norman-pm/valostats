package com.valostats.valostats.service;

import com.valostats.valostats.model.Jugador;
import com.valostats.valostats.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;

    public  List<Jugador> findAll(){
        return jugadorRepository.findAll();
    }

    public Jugador findById(Long id){
        return jugadorRepository.findById(id).orElse(null);
    }

    public void save(Jugador jugador){
        jugadorRepository.save(jugador);
    }
    public void deleteById(Long id) {
        jugadorRepository.deleteById(id);
    }

}
