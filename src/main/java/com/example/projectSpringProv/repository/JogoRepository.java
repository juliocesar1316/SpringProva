package com.example.projectSpringProv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectSpringProv.entity.JogoEntity;

public interface JogoRepository extends JpaRepository<JogoEntity, Long> {
    
    public List<JogoEntity> findByJogTituloContainsIgnoreCaseAndJogEstudioContainsIgnoreCase(String jogTitulo, String jogEstudio);


}
