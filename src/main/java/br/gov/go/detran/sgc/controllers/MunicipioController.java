package br.gov.go.detran.sgc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("municipio")
public class MunicipioController {

    @GetMapping
    public String findMunicipio() {
        return "Goiânia";
    }
}
