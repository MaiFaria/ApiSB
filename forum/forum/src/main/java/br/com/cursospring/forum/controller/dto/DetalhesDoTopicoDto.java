package br.com.cursospring.forum.controller.dto;

import br.com.cursospring.forum.modelo.StatusTopico;
import br.com.cursospring.forum.modelo.Topico;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DetalhesDoTopicoDto {

    private Long Id;
    private String Titulo;
    private String Mensagem;
    private LocalDateTime DataCriacao;
    private String nomeAutor;
    private StatusTopico status;
    private List<RespostaDto> respostas;

    public DetalhesDoTopicoDto(Topico topico) {
        this.Id = topico.getId();
        this.Titulo = topico.getTitulo();
        this.Mensagem = topico.getMensagem();
        this.DataCriacao = topico.getDataCriacao();
        this.nomeAutor = topico.getAutor().getNome();
        this.status = topico.getStatus();
        this.respostas = new ArrayList<>();
        this.respostas.addAll(topico.getRespostas().stream().map(RespostaDto::new).collect(Collectors.toList()));
    }

    public Long getId() {
        return Id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getMensagem() {
        return Mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return DataCriacao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public StatusTopico getStatus() {
        return status;
    }

    public List<RespostaDto> getRespostas() {
        return respostas;
    }
}
