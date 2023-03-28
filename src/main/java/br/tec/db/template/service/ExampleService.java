package br.tec.db.template.service;

import br.tec.db.template.model.Example;
import br.tec.db.template.repository.ExampleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExampleService {
    private final ExampleRepository exampleRepository;

    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    public Example createExample(String name){
        Example example = new Example(name);
        return exampleRepository.save(example);
    }

    public Optional<Example> findExample(Long id) {
        return exampleRepository.findById(id);
    }
}
