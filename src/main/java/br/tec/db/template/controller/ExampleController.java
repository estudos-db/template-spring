package br.tec.db.template.controller;

import br.tec.db.template.model.Example;
import br.tec.db.template.service.ExampleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/example")
@Tag(name = "Example")
public class ExampleController {
    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @PostMapping
    public ResponseEntity<Example> createExample(@RequestParam String name){
        return new ResponseEntity<>(exampleService.createExample(name), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Optional<Example>> findExample(@RequestParam Long id){
        return new ResponseEntity<>(exampleService.findExample(id), HttpStatus.OK);
    }
}
