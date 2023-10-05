package com.example.projectSpringProv.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectSpringProv.entity.JogoEntity;
import com.example.projectSpringProv.repository.JogoRepository;

@Service
public class JogoService implements JogoInterface{
    
    @Autowired
    private JogoRepository jogoRepo;

    @Override
    public JogoEntity novoJogo(JogoEntity jogo){
        
        if(jogo == null ||
            jogo.getJogTitulo() == null ||
            jogo.getJogTitulo().isBlank() ||
            jogo.getJogEstudio() == null ||
            jogo.getJogEstudio().isBlank()){
                throw new IllegalArgumentException("Existem campos em brancos ou nulos!");
        }

        if(jogo.getJogDataLancamento() == null){
            jogo.setJogDataLancamento(LocalDateTime.now());
        }

        return jogoRepo.save(jogo);
    }

    @Override
    public List<JogoEntity> listarJogos(String jogTitulo, String jogEstudio) {
        return jogoRepo.findByJogTituloContainsIgnoreCaseAndJogEstudioContainsIgnoreCase(jogTitulo, jogEstudio);
    }

    @Override
    public List<JogoEntity> listarTodosJogos() {
       return jogoRepo.findAll();
    }
}
