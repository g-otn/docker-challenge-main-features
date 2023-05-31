package br.com.gotn.dockerchallenge.repository;

import br.com.gotn.dockerchallenge.model.ProgrammingLanguage;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingLanguageRepository extends ListCrudRepository<ProgrammingLanguage, Long> {

}
