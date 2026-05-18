package com.valostats.valostats.service;

import com.valostats.valostats.model.Equip;
import com.valostats.valostats.repository.EquipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EquipService {
    //Spring  inyecta automaticamente el repositorio
    @Autowired
    private EquipRepository equipRepository;

    //retorna todos los equipos
    public List<Equip> findAll() {
        return equipRepository.findAll();
    }

    //retorna el equip per id
    public  Equip findById(Long id) {
        return equipRepository.findById(id).orElse(null);
    }

    // Guarda/ actualiza un equipo
    public void save(Equip equip) {
        equipRepository.save(equip);
    }

    //Elimina equipo por id
    public void deleteById(Long id) {
        equipRepository.deleteById(id);
    }


}
