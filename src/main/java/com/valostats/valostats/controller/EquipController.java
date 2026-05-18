package com.valostats.valostats.controller;

import com.valostats.valostats.model.Equip;
import com.valostats.valostats.service.EquipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/*
TEMPORAL
@Controller
@RequestMapping("/equips")
public class EquipController {

    @Autowired
    private EquipService equipService;

    @GetMapping
    public String llistar(Model model) {
        model.addAttribute("equips", equipService.findAll());
        return "equips/llistat";
    }
}

 */
@Controller
@RequestMapping("/equips")
public class EquipController {

    @Autowired
    private EquipService equipService;
    // lista todos los equipos
    @GetMapping
    public String llistar(Model model) {
        model.addAttribute("equips", equipService.findAll());
        return "equips/llistat";
    }
    // formulario para añadir un equipo
    @GetMapping("/nou")
    public String nouEquip(Model model) {
        model.addAttribute("equip", new Equip());
        return "equips/formulari";
    }

    // formulario para editar un equipo existente
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("equip", equipService.findById(id));
        return "equips/formulari";
    }

    //guardar equipo nuevo o editado
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Equip equip) {
        equipService.save(equip);
        return "redirect:/equips";
    }
}
