package br.com.cursospring.forum.controller.dto;

import br.com.cursospring.forum.modelo.Topico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TopicoDto {
    private Long Id;
    private String Titulo;
    private String Mensagem;
    private LocalDateTime DataCriacao;

    public TopicoDto(Topico topico) {
        this.Id = topico.getId();
        this.Titulo = topico.getTitulo();
        this.Mensagem = topico.getMensagem();
        this.DataCriacao = topico.getDataCriacao();
    }

    public static List<TopicoDto> converter(List<Topico> topicos) {
        return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
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
}
