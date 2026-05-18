package com.valostats.valostats.service;

import com.valostats.valostats.model.Stats;
import com.valostats.valostats.repository.StatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class StatsService {
    @Autowired
    private StatsRepository statsRepository;

    public  List<Stats> findAll(){
        return statsRepository.findAll();
    }

    public Stats findById(Long id){
        return statsRepository.findById(id).orElse(null);
    }

    public void save(Stats jugador){
        statsRepository.save(jugador);
    }
    public void deleteById(Long id) {
        statsRepository.deleteById(id);
    }

}

