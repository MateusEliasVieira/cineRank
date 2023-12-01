package com.example.demo.api.dto.filme;

import com.example.demo.domain.enums.Genero;

import com.example.demo.domain.model.Ator;
import com.example.demo.domain.model.Comentario;
import com.example.demo.domain.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilmeResponseDTO {

    private Long idFilme;
    private String titulo;
    private String diretor;
    private Genero genero;
    private String sinopse;
    private Date lancamento;
    private int duracao;
    private int classificacao;
    private String distribuidora;
    private List<Comentario> comentarios;
    private List<Ator> atores;

}
