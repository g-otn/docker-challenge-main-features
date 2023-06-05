package br.com.gotn.soat1.dockerchallenge.repository;

import br.com.gotn.soat1.dockerchallenge.model.ProgrammingLanguage;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingLanguageRepository extends ListCrudRepository<ProgrammingLanguage, Long> {

}
