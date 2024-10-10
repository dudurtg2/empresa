package com.example.empresa.entities;

import jakarta.persistence.*;

@Table(name = "Historico")
@Entity
public class Historico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "dataCriacao", nullable = false)
    private String dataCriacao;

    @Column(name = "dataSaida", nullable = false)
    private String dataSaida;

    @Column(name = "dataFinalizacao", nullable = false)
    private String dataFinalizacao;
    
    @Column(name = "idRomaneio", nullable = false)
    private int idRomaneio;
    
    public Historico() {}

    public Historico(String dataCriacao, String dataSaida, String dataFinalizacao, int idRomaneio) {
        this.dataCriacao = dataCriacao;
        this.dataSaida = dataSaida;
        this.dataFinalizacao = dataFinalizacao;
        this.idRomaneio = idRomaneio;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataCriacao() {
        return this.dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataSaida() {
        return this.dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getDataFinalizacao() {
        return this.dataFinalizacao;
    }

    public void setDataFinalizacao(String dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }

    public int getidRomaneio() {
        return this.idRomaneio;
    }

    public void setidRomaneio(int idRomaneio) {
        this.idRomaneio = idRomaneio;
    }

}   
