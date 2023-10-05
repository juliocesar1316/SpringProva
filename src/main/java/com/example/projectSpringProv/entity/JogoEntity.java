package com.example.projectSpringProv.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jog_jogo")
public class JogoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jog_id")
    private Long jogId;

    @Column(name = "jog_titulo")
    private String jogTitulo;

    @Column(name = "jog_estudio")
    private String jogEstudio;

    @Column(name = "jog_data_hora_lancamento")
    private LocalDateTime jogDataLancamento;

    @Column(name = "jog_classificacao")
    private String jogClassificacao;

    @Column(name = "jog_duracao_media")
    private Double jogDuracao;

    public JogoEntity(Long jogId, String jogTitulo, String jogEstudio, LocalDateTime jogDataLancamento, String jogClassificacao, Double jogDuracao ){
        this.jogId = jogId;
        this.jogTitulo = jogTitulo;
        this.jogEstudio = jogEstudio;
        this.jogDataLancamento = jogDataLancamento;
        this.jogClassificacao = jogClassificacao;
        this.jogDuracao = jogDuracao;
    }

    public Long getJogId() {
        return jogId;
    }

    public void setJogId(Long jogId) {
        this.jogId = jogId;
    }

    public String getJogTitulo() {
        return jogTitulo;
    }

    public void setJogTitulo(String jogTitulo) {
        this.jogTitulo = jogTitulo;
    }

    public String getJogEstudio() {
        return jogEstudio;
    }

    public void setJogEstudio(String jogEstudio) {
        this.jogEstudio = jogEstudio;
    }

    public LocalDateTime getJogDataLancamento() {
        return jogDataLancamento;
    }

    public void setJogDataLancamento(LocalDateTime jogDataLancamento) {
        this.jogDataLancamento = jogDataLancamento;
    }

    public String getJogClassificacao() {
        return jogClassificacao;
    }

    public void setJogClassificacao(String jogClassificacao) {
        this.jogClassificacao = jogClassificacao;
    }

    public Double getJogDuracao() {
        return jogDuracao;
    }

    public void setJogDuracao(Double jogDuracao) {
        this.jogDuracao = jogDuracao;
    }

    public JogoEntity(){

    }

    
}
