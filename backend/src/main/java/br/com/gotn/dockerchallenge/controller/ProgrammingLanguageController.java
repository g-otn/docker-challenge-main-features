package br.com.gotn.dockerchallenge.controller;

import br.com.gotn.dockerchallenge.model.ProgrammingLanguage;
import br.com.gotn.dockerchallenge.repository.ProgrammingLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/programming-languages")
public class ProgrammingLanguageController {

    private final ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageController(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @GetMapping
    public List<ProgrammingLanguage> getProgrammingLanguages() {
        return programmingLanguageRepository.findAll();
    }
}
