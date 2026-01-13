package org.example.model;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pokemon")
public class Pokemon {
    @Id
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private String id;
    private String nome;
    private String[] tipo;
    private String nivel;
    private String[] habilidades;

    //clave foranea
    private String adestradorId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    public String getAdestradorId() {
        return adestradorId;
    }

    public void setAdestradorId(String adestradorId) {
        this.adestradorId = adestradorId;
    }
}
