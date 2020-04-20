package com.github.fatimascarneiro.ayudame.controllers;

import com.github.fatimascarneiro.ayudame.forms.PublicacaoForm;
import com.github.fatimascarneiro.ayudame.services.PublicacaoService;
import com.github.fatimascarneiro.ayudame.views.PublicacaoView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PublicacaoController {

    private final PublicacaoService service;

    @Autowired
    public PublicacaoController(PublicacaoService service) {
        this.service = service;
    }

    public PublicacaoView cadastrarPublicacao(PublicacaoForm form) {
        return service.adicionarPublicacao(form);
    }
}
