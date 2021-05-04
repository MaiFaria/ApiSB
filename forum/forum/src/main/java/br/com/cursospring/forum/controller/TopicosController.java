package br.com.cursospring.forum.controller;

import  br.com.cursospring.forum.controller.dto.TopicoDto;
import br.com.cursospring.forum.modelo.Curso;
import br.com.cursospring.forum.modelo.Topico;
import br.com.cursospring.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {
        List<Topico> topicos = topicoRepository.findAll();
        return TopicoDto.converter(topicos);
    }
}
