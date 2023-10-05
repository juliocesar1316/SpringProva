package com.example.projectSpringProv.service;

import java.util.List;

import com.example.projectSpringProv.entity.JogoEntity;

public interface JogoInterface {

    public JogoEntity novoJogo(JogoEntity jogo);

    public List<JogoEntity> listarJogos(String jogTitulo, String jogEstudio);

    public List<JogoEntity> listarTodosJogos();
}
