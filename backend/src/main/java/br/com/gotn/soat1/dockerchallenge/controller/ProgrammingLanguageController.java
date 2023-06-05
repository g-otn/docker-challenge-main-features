package br.com.gotn.soat1.dockerchallenge.controller;

import br.com.gotn.soat1.dockerchallenge.repository.ProgrammingLanguageRepository;
import br.com.gotn.soat1.dockerchallenge.model.ProgrammingLanguage;
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
