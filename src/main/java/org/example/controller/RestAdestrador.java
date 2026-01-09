package org.example.controller;


import org.example.model.Adestrador;
import org.example.service.AdestradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(RestAdestrador.MAPPING)
public class RestAdestrador {

    public static final String MAPPING = "/mongodb/adestrador";

    @Autowired
    private AdestradorService adestradorService;

    @PostMapping("/gardar")
    public ResponseEntity<Adestrador> gardar(@RequestBody Adestrador profesor) {
        adestradorService.crearAdestrador(profesor);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<Adestrador>> listarColeccion() {
        List<Adestrador> adestradores = adestradorService.buscarAdestradores();
        return new ResponseEntity<>(adestradores, HttpStatus.OK);
    }


}
