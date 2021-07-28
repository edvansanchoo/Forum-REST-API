package br.com.alura.forum.controller;


import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicosController {

    @RequestMapping("/topicos")
    @ResponseBody
    public List<Topico> lista(){
        Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programação"));

        return Arrays.asList(topico, topico, topico, topico);
    }
}
