package com.example.projectSpringProv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectSpringProv.entity.JogoEntity;
import com.example.projectSpringProv.service.JogoService;

@RestController
@RequestMapping (value ="/jogo" )
@CrossOrigin
public class JogoController {
    
    @Autowired
    private JogoService jogoServ;

    @PostMapping
    public ResponseEntity<JogoEntity> novoJogo(@RequestBody JogoEntity jogo){
        return ResponseEntity.status(HttpStatus.CREATED).body(jogoServ.novoJogo(jogo));
    }

    @GetMapping(value = "/titulo_estudio/{titulo}/{estudio}")
    public ResponseEntity<List<JogoEntity>> buscarJogo( @PathVariable("titulo") String jogTitulo, @PathVariable("estudio") String jogEstudio ){
        return ResponseEntity.status(HttpStatus.OK).body(jogoServ.listarJogos(jogTitulo, jogEstudio));
    }

    @GetMapping()
    public ResponseEntity<List<JogoEntity>> listarJogos(){
        return ResponseEntity.status(HttpStatus.OK).body(jogoServ.listarTodosJogos());
    }

}
